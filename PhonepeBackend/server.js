const express = require("express");
const app = express();

app.get("/", (req, res) => {
    res.send("I am phonepe backend server");
});

app.listen(3000, () => {
    console.log("Example app listening on port 3000!");
});