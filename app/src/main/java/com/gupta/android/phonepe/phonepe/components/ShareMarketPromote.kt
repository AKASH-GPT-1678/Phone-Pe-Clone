package com.gupta.android.phonepe.phonepe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.gupta.android.phonepe.ui.theme.Purple80
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.gupta.android.phonepe.ui.theme.DarkPurple
import com.gupta.android.phonepe.ui.theme.Purple40
import com.gupta.android.phonepe.R

@Preview
@Composable
fun ShareMarketAd(){
    Surface (
        modifier = Modifier.fillMaxWidth(),

        color = Color(0xFFE6DDEF)


    ) {
        Row {
            Column (
                modifier = Modifier.padding(14.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ){
                Text(text = "One Platform for" , fontWeight = FontWeight.Bold ,  fontSize =  20.sp, color = DarkPurple)
                Text(text = "all your investments", fontWeight = FontWeight.Bold ,  fontSize =  20.sp, color = DarkPurple)
                Text(text = "Trusted By 1 Crore+ Indians", color = Color(0xFF7D54A4)
                )
                Box(
                    modifier = Modifier.background(color = DarkPurple)
                        .padding(12.dp)
                        .clip(RoundedCornerShape(10.dp))

                ) {
                  Text(text = "Install Now" , color = Color.White , fontWeight = FontWeight.Bold)
                }
            }

            Image(painter = painterResource(R.drawable.share_market ), contentDescription = "share market",
                modifier = Modifier.padding(top = 26.dp , start = 24.dp)


                )



        }


    }

}