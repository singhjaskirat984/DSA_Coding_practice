const http = require("http");
const app = require("./astrotak");
const server = http.createServer(app);


server.listen(3000,console.log("app is running at loclahost 3000"));