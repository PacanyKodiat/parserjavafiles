var Config = require('./config');
global.Config = Config;
var File = require('files');
var strings = require('strings');

var files = File.getFilesFromDirectory(Config.JAVAFilesDir);
for (var i = 0; i < files.length; i++) {
    files[i].cutContent();
    files[i].updateContent();//addComment & removeOldCode
    files[i].updateFuncName();
    //console.log(files[i].getContent());

    //resolve errors
    //files[i].Errors();

    files[i].save();
}

console.log("\n-----\n" + File.count + " " + Config.succesfull + "\n");


