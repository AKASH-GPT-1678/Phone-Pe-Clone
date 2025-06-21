package com.gupta.android.phonepe.phonepe.components.moneytransfer
import androidx.compose.foundation.Image
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
import com.gupta.android.phonepe.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun MoneyTransferByNumber(
    onSearchClick : ()-> Unit
){

    val isVisible = true;
    val showSendMoney = true;

    Column (
        modifier = Modifier.padding(horizontal = 20.dp)
    ){


        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 40.dp, start = 14.dp, end = 14.dp)
        ) {


            Icon(
                painter = painterResource(R.drawable.back_arrow),
                contentDescription = "back arrow",
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))


            if (isVisible) {
                Text(text = "Send Money", fontSize = 20.sp, fontWeight = FontWeight.Bold)

            }
            Spacer(modifier = Modifier.weight(1f))

            Icon(
                painter = painterResource(R.drawable.reload),
                contentDescription = "back arrow",
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))

            Icon(
                painter = painterResource(R.drawable.que_mark),
                contentDescription = "back arrow",
                modifier = Modifier.size(28.dp)
            )


        }
        if(showSendMoney){
            SendMoneyUPI()

        }

        Spacer(modifier = Modifier.height(14.dp))


        SearchSectiontransfer(placeholder = "Search for any name or number", onSearchClick = onSearchClick)
    }

}

@Composable
fun MoneyTransferNavigation(){
    val navController = rememberNavController()

    NavHost( navController = navController,
        startDestination = "Moneytransfer"
    ){

        composable("Moneytransfer") {
            MoneyTransferByNumber(onSearchClick = {
                navController.navigate("Payment")
            })
        }
        composable(
            "Payment"
        ) {
            SearchForPay()
        }

    }
}

@Composable
fun SendMoneyUPI(){
    Text(text = "Send Money" , fontWeight = FontWeight.Bold, fontSize = 30.sp , modifier = Modifier.padding(top = 10.dp))
    Row (
        modifier = Modifier.fillMaxWidth()
    ){
        Text(text = "to any UPI app", fontWeight = FontWeight.Bold,modifier = Modifier.padding(top = 20.dp))
        Image(
            painter = painterResource(R.drawable.phonepe),
            contentDescription = "phonpe",
            modifier = Modifier.size(width = 80.dp , height = 50.dp)

        )
        Image(
            painter = painterResource(R.drawable.gpay),
            contentDescription = "phonpe",
            modifier = Modifier.size(width = 70.dp , height = 50.dp)

        )
        Image(
            painter = painterResource(R.drawable.paytml),
            contentDescription = "phonpe",
            modifier = Modifier.size(width = 70.dp , height = 50.dp)

        )
    }


}



@Composable
fun SearchSectiontransfer(
    placeholder : String,
    onSearchClick: () -> Unit
){
    Surface(
        modifier = Modifier.fillMaxWidth()
            .height(60.dp)



        ,
        shape = RoundedCornerShape(36.dp),
        onClick = onSearchClick,


        color = Color(0xFFE6DDEF)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "search",
                modifier = Modifier.padding(start = 8.dp , top = 8.dp).size(40.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(text = placeholder, fontSize = 16.sp , color = Color.Gray)

            Spacer(modifier = Modifier.weight(1f))


        }

    }


}
