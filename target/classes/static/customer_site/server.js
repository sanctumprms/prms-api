/*!
 * NodeJs Web Server v1.0
 * Copyright 2015 Hotel, Inc.
 * Licensed under XXX
 */

var express = require('express');
var bodyParser = require('body-parser');
var app = express();

// set up our express application
app.use(bodyParser.urlencoded({'extended':'true'})); 			// parse application/x-www-form-urlencoded
app.use(bodyParser.json()); 									// parse application/json
app.use(bodyParser.json({ type: 'application/vnd.api+json' })); // parse application/vnd.api+json as jsonSSS

app.use(express.static(__dirname, '/scripts'));


app.get('/', function(req, res){
    res.sendFile(__dirname +'/index.html');
});

app.listen(80);
