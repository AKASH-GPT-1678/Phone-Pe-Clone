const express = require("express");
const app = express();
const {Data}  = require("./android.js");
const router = require("./router/router.js")
const cors = require("cors");


app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(cors());


app.get("/", (req, res) => {
    res.send("I am phonepe backend server");
    
});


app.use("/api", router);
app.listen(3000, () => {
    console.log("Example app listening on port 3000!");
    console.log(Data);
});