package com.gupta.android.phonepe.phonepe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.gupta.android.phonepe.R

@Preview
@Composable
fun RechargeandBill(){
    Column (
        modifier = Modifier.background(color = Color(0xFFEBEDEF)
        )
    ){
        Row (
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 10.dp)
            ,

            horizontalArrangement = Arrangement.SpaceBetween

        ){

            Text(text = "Recharge & Bills" , fontWeight = FontWeight.Bold , fontSize = 20.sp )
            Text(text = "View All" , fontSize = 14.sp)



        }

        Spacer(modifier = Modifier.height(20.dp))

        Row (
            modifier = Modifier.padding(horizontal = 20.dp , vertical = 10.dp)
            ,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            ServiceItem(
               imageResId =  R.drawable.purple_phone,
                label = "Recharge",


            )

            ServiceItem(
                imageResId = R.drawable.homeog,
                label = "Rent"
            )

            ServiceItem(
                imageResId = R.drawable.purple_bulb,
                label = "Electricity"
            )

            ServiceItem(
                imageResId = R.drawable.money_bag,
                label = "Loan EMI"
            )









        }
    }

}


@Composable
fun ServiceItem(
        imageResId: Int,
        label: String,
        circleSize: Dp = 80.dp,
        paddingInside: Dp = 16.dp,
        backgroundColor: Color = Color.White
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier.size(circleSize),
                shape = CircleShape,
                color = backgroundColor
            ) {
                Image(
                    painter = painterResource(imageResId),
                    contentDescription = label,
                    modifier = Modifier.padding(paddingInside)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = label, fontWeight = FontWeight.Bold , fontSize = 18.sp)
        }
    }

