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
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.constraintlayout.compose.ConstraintLayout
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

         Transaction(isDebit = true)
         Transaction(isDebit = false)
        Transaction(isDebit = true)


    }
}


//@Preview
@Composable
fun Transaction(
    isDebit : Boolean,



){
    Row(
        modifier = Modifier.padding(vertical = 20.dp, horizontal = 12.dp).fillMaxWidth()
        ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val image = if(isDebit ) {
            painterResource(R.drawable.upward_arrow)
        }
        else {
            painterResource(R.drawable.downward)
        }
        Icon(
            painter = image,
            contentDescription = " arrow"
            ,
            modifier = Modifier.padding(20.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .size(50.dp)
                .background(color = Color(0xFFE5E4E2))
                .padding(6.dp)

        )

        ConstraintLayout() {
            val (text1, text2, text3) = createRefs()

            Text(
                text = if (isDebit){"Paid to"} else "Credited to",
                fontSize = 12.sp,
                modifier = Modifier.constrainAs(text1) {
                    top.linkTo(parent.top, margin = 14.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )

            Text(
                text = "JALALI",
                fontSize = 20.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.constrainAs(text2) {
                    top.linkTo(text1.bottom, margin = 12.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )

            Text(
                text = "19 jUN 2023",
                fontSize = 10.sp,
                modifier = Modifier.constrainAs(text3) {
                    top.linkTo(text2.bottom, margin = 10.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        ConstraintLayout {
            val (amountRef , typeRef) = createRefs()
            Text(text = "8000" , fontWeight = FontWeight.Bold , fontSize = 28.sp , modifier = Modifier.constrainAs(amountRef) {

            })

            Row (
                modifier = Modifier.constrainAs(typeRef) {
                    top.linkTo(amountRef.bottom , margin = 8.dp)
                }
            ) {
                Text(text = if(isDebit){"Debited From"} else {"Credited to   "})
                Spacer(modifier = Modifier.width(6.dp))
                androidx.compose.foundation.Image(
                    painter = painterResource(R.drawable.canara),
                    contentDescription = "platform for transfer",
                    modifier = Modifier.size(20.dp)

                )
            }





        }



    }
}