package com.gupta.android.phonepe.phonepe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.ComposableTarget
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gupta.android.phonepe.R


@Preview
@Composable
fun TicketHeader(){

    ConstraintLayout(
        modifier = Modifier.height(300.dp)
            .fillMaxWidth()
    ) {

        val (imageRef , boxRef, quemark) = createRefs()
        Image(
            painter = painterResource(R.drawable.bus1),
            contentDescription = "icon",
            modifier = Modifier.fillMaxSize()
                .constrainAs(imageRef) {  }
        )



        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(12.dp)) // clip first
                .background(Color.Yellow)        // then apply background
                .constrainAs(boxRef) {
                    start.linkTo(imageRef.start, margin = 20.dp)
                    top.linkTo(imageRef.top, margin = 48.dp)
                },
            contentAlignment = Alignment.Center
        ) {




                Text(text = "*", fontSize = 36.sp)



        }

        Icon(
            painter = painterResource(R.drawable.quemark)
            ,
            modifier = Modifier.size(40.dp)
                .constrainAs(quemark){
                    start.linkTo(imageRef.end , margin = -50.dp)
                    top.linkTo(imageRef.top , margin = 48.dp)
                }
                .background(color = Color.White)

            ,
            contentDescription = "imahe"
        )

    }

}