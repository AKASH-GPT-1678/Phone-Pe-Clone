package com.gupta.android.phonepe.phonepe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gupta.android.phonepe.R

import androidx.compose.ui.unit.dp


@Preview
@Composable
fun FinanceOffers(){

    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Column (
            modifier = Modifier.fillMaxWidth(0.5f)
        ) {
            Image(painter = painterResource( R.drawable.group1), contentDescription = "image", modifier = Modifier.fillMaxWidth().size(80.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Image(painter = painterResource( R.drawable.group_4), contentDescription = "image", modifier = Modifier.fillMaxWidth().size(80.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Image(painter = painterResource( R.drawable.group_5), contentDescription = "image", modifier = Modifier.fillMaxWidth().size(80.dp))

        }
        Column (
            modifier = Modifier.fillMaxWidth()

        ) {
            Image(painter = painterResource( R.drawable.group_3), contentDescription = "image", modifier = Modifier.fillMaxWidth().size(80.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Image(painter = painterResource( R.drawable.group1), contentDescription = "image", modifier = Modifier.fillMaxWidth().width(80.dp).height(160.dp))
//            Image(painter = painterResource( R.drawable.group1), contentDescription = "image", modifier = Modifier.fillMaxWidth().size(80.dp))



        }
    }



}