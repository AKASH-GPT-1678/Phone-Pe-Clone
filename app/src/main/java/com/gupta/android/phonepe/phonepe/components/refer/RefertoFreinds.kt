package com.gupta.android.phonepe.phonepe.components.refer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gupta.android.phonepe.R


@Preview
@Composable
fun ReferandEarnPage(){
    Column (
        modifier = Modifier.background(color = Color(0xFF6C03A1)),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            modifier = Modifier.padding(12.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.back_arrow),
                contentDescription = "back arrow",
                modifier = Modifier.size(28.dp),
                tint = Color.White)
            Spacer(modifier = Modifier.weight(1f))

            Icon(
                painter = painterResource(R.drawable.que_mark),
                contentDescription = "back arrow",
                tint = Color.White,
                modifier = Modifier.size(28.dp)
            )





        }



        Spacer(modifier = Modifier.height(100.dp))

        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.White , fontSize = 24.sp, fontWeight = FontWeight.Bold) ) {
                    append("Earn $200!\n")

                }
                withStyle(style = SpanStyle(color = Color.White , fontSize = 15.sp, fontWeight = FontWeight.Bold) ) {
                    append("Invite your Indian contacts and\n")

                }
                withStyle(style = SpanStyle(color = Color.White , fontSize = 15.sp, fontWeight = FontWeight.Bold) ) {
                    append("NRI freinds & family to PhonePe\n")

                }
                withStyle(style = SpanStyle(color = Color.White , fontSize = 15.sp, fontWeight = FontWeight.Bold) ) {
                    append("Earn on thier 1st UPI payment\n")

                }


            }
        )
        val  brush = Brush.horizontalGradient(
            colors = listOf(
                Color(0xFFE1BF04),
                Color(0xFFEAD456),
                Color(0xFFF3DF6A)
            )
        )



        Box(
            modifier = Modifier
                .padding(12.dp)
                .background(brush, shape = RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .padding(10.dp)
        ) {
            Text("How to Refer to freind")
        }

    }
}