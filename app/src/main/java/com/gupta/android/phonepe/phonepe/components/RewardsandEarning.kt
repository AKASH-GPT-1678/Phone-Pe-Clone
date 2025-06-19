package com.gupta.android.phonepe.phonepe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.gupta.android.phonepe.R

@Preview
@Composable
fun RewardsandEarnings() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.rewards),
            contentDescription = "rewards",
            modifier = Modifier
                .weight(1f)
                .aspectRatio(1f) // keeps image square
        )

        Image(
            painter = painterResource(R.drawable.reward_2),
            contentDescription = "rewards",
            modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
        )


    }
}


