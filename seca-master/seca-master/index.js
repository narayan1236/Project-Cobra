const express = require('express');
const app = express();
require('./db');
const User = require('./users');
const client = require('./students');
const bodyParser = require('body-parser');

app.use(bodyParser.urlencoded({
    extended: false
}));

app.use(bodyParser.json());

app.get('/show', (req, res)=>{
    res.status(200).send("Hello world");
});

app.put("/save", async (req,res)=>{
    try{
        let user = new User();
        const {regno, name, marks} =  req.body;
        user.regno = regno;
        user.name = name;
        user.marks = marks;
        user = await user.save();
        res.status(200).send({data: user});
    } catch(err) {
        console.log(err);
        res.status(500).send("Some Error");
    }
});

app.put("/save/student", async (req,res)=>{
    try{
        let client = new client();
        const {name, location, address} =  req.body;
        console.log(name);
        let u = await User.findOne({name}, {_id: 1});
        console.log(u)
        client.user = u._id;
        client.location = location;
        client.name = name;
        client.address = address;
        client = await client.save();
        res.status(200).send({data: client});
    } catch(err) {
        console.log(err);
        res.status(500).send("Some Error");
    }
});

app.get("/finduser", async (req,res)=>{
    try{
        let user = await user.find();
        let time = 0;
        user.map((u)=>{
            time += u.marks;
        })
        let average = time/user.length;
        res.status(200).send({data: user, avg: average});
    } catch(err) {
        console.log(err);
        res.status(500).send("Some Error");
    }
})

app.get("/findstudent", async (req,res)=>{
    try{
        let data = await client.find().populate('user', {regno: 1, marks: 1});
        let finaldata = {};
        data.map((stu, index)=>{
            finaldata[index] = {regno: stu.user.regno, name: stu.name, location: stu.location, 
                address: stu.address, marks: stu.user.marks};
        })
        res.status(200).send({data: finaldata});
    } catch(err) {
        console.log(err + "error");
        res.status(500).send("Some Error");
    }
})

app.listen(4000, ()=>{
    console.log("server started and again");
})