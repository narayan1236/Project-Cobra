const mongoose = require('mongoose');
const Schema = mongoose.Schema;
const timestamps = require('mongoose-timestamps');

const clientSchema = new Schema({
    name: {type: String, default: ''},
    location: {type: String, default: ''},
    address: {type: String, default: ''},
    user: {type: mongoose.Schema.ObjectId, ref: 'User', required: true}
});

clientSchema.pre("save", (next)=>{
    this.updated_at = Date.now();
    next();
});

clientSchema.plugin(timestamps, {index: true});

module.exports = mongoose.model('Student', StudentSchema);