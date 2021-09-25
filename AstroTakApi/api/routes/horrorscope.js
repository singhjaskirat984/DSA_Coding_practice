const express = require("express");
const { response } = require("../../astrotak");
const router = express.Router();
const HorrorScope = require('../model/horrorscope')

router.get('/',(req,res,next)=>{
   HorrorScope.find()
   .then(result=>{
       res.status(200).json({
           horrorscopeData:result
       })
   })

   .catch(err=>{
       console.log(err);
       res.status(500).json({
           error:err
       })
   })
})

router.post('/',(req,res,next)=>{
    const horrorscope = new HorrorScope({
        httpStatus: req.body.httpStatus,
        httpsStatusCode: req.body.httpsStatusCode,
        success: req.body.success,
        message: req.body.message,
        apiName: req.body.apiName,
        data: req.body.data
    })

    horrorscope.save()
    .then(result=>{
        console.log(result)
        res.status(200).json({
            newHorrorScope: result
        })
    })

    .catch(err=>{
        console.log(err);
        res.status(500).json({
            error:err
        })
    })


})


module.exports = router;