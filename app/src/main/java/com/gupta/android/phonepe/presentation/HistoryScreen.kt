package com.gupta.android.phonepe.presentation

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.gupta.android.phonepe.R

@Preview
@Composable
fun HistoryScreen(){
    SearchHeader()
}




@Preview
@Composable
fun SearchHeader(){
    Column (
        modifier = Modifier.fillMaxWidth()
    ) {


        Spacer(modifier = Modifier.height(20.dp))


        Row(
            modifier = Modifier.padding(20.dp).fillMaxWidth(),

            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "History", fontWeight = FontWeight.Bold, fontSize = 18.sp)

            Spacer(modifier = Modifier.weight(1f))

            Box(
                modifier = Modifier.clip(RoundedCornerShape(20.dp))
                    .border(
                        width = 1.dp,
                        color = Color.Gray, // change color as needed
                        shape = RoundedCornerShape(20.dp)
                    )


            ) {
                Text(
                    text = "My Statements",
                    modifier = Modifier.padding(14.dp),
                    fontWeight = FontWeight.Bold
                )
            }
        }


        Spacer(modifier = Modifier.height(12.dp))

        Surface(
            modifier = Modifier.fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 14.dp)

            ,
            shape = RoundedCornerShape(36.dp),


            color = Color(0xFFE6DDEF)
        ) {
         Row (
             verticalAlignment = Alignment.CenterVertically
         ) {
             Icon(
                 imageVector = Icons.Filled.Search,
                 contentDescription = "search",
                 modifier = Modifier.padding(start = 8.dp , top = 10.dp).size(40.dp)
             )

              Spacer(modifier = Modifier.width(16.dp))

             Text(text = "Search transactions", fontSize = 20.sp)

             Spacer(modifier = Modifier.weight(1f))


             androidx.compose.foundation.Image(
                 painter = painterResource(R.drawable.filter),
                 contentDescription = "filter"
                 ,
                 modifier = Modifier.size(36.dp)
                     .padding(end = 10.dp)
             )
         }

        }
        Spacer(modifier = Modifier.height(40.dp))
        HorizontalDivider()

    }
}