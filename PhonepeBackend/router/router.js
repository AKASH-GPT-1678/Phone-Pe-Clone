const express = require("express");
const router = express.Router();
const {Data}  = require("../android.js");

router.get("/offers", (req, res) => {
    res.send(Data);
  
});


module.exports = router;