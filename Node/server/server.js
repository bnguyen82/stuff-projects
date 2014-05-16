var http = require("http");
var url = require("url");

function start() {
  function onRequest(request, response) {
    console.log("Request received.");
    path = url.parse(request.url).pathname;

    route(path);

    response.writeHead(200, {"Content-Type": "text/plain"});
    response.write("Hello World");
    response.end();
  }

  http.createServer(onRequest).listen(8888);
  console.log("Server has started.");
}

exports.start = start;