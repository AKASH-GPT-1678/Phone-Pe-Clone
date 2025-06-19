package com.gupta.android.phonepe.phonepe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridItemScope
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gupta.android.phonepe.R
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.gupta.android.phonepe.model.SponsoredData


@Composable
fun SponsoredLinks() {
    val Sponsors = listOf(
        SponsoredData(R.drawable.rummy_circle, "Rummy Circle"),
        SponsoredData(R.drawable.zupee, "Zupee"),
        SponsoredData(R.drawable.mpl_winpatti, "MPL Win Patti"),
        SponsoredData(R.drawable.winzo_ludo, "Winzo Ludo"),
        SponsoredData(R.drawable.poker_circle, "Poker Circle"),
        SponsoredData(R.drawable.taj_rummy, "Taj Rummy"),
        SponsoredData(R.drawable.rush_ludo, "Rush Ludo"),
        SponsoredData(R.drawable.a23_rummy, "A23 Rummy")
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(4),
        contentPadding = PaddingValues(10.dp),
        modifier = Modifier.height(250.dp)
    ) {
        items(Sponsors) { sponsor ->
            SponsoredAd(image = sponsor.image, label = sponsor.label)
        }
    }
}


@Composable
fun SponsoredAd(
    image : Int,
    label : String
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
        ,
        modifier = Modifier.padding(20.dp)

    ) {
        Image(painter = painterResource(image), contentDescription = label, modifier = Modifier.clip(
            RoundedCornerShape(30.dp)
        ).size(50.dp) )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = label)
    }
}