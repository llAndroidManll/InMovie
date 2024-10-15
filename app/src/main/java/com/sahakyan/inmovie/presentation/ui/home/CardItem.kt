package com.sahakyan.inmovie.presentation.ui.home

import android.widget.TextView
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sahakyan.inmovie.domain.data.PopularMovie
import com.sahakyan.inmovie.shared.compose.style.dimens

@Composable
fun CardItem(
    data: PopularMovie = PopularMovie(),
    modifier: Modifier = Modifier,
    onItemClick: (Int) -> Unit = {},
) {

}

@Composable
@Preview(showBackground = true)
fun CardItemPreview() {
    CardItem(
        data = PopularMovie(),
        onItemClick = {}
    )
}