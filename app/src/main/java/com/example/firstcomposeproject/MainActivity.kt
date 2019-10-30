package com.example.firstcomposeproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                NewsStory()
            }
        }
    }
}

@Composable
fun NewsStory() {
    val image = +imageResource(R.drawable.header)

    Column(
        crossAxisSize = LayoutSize.Expand,
        modifier = Spacing(16.dp)
    ) {
        Container(expanded = true, height = 180.dp) {
            Clip(shape = RoundedCornerShape(8.dp)) {
                DrawImage(image)
            }
        }
        HeightSpacer(height = 16.dp)
        Text(
            text = "Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            style = (+themeTextStyle { h6 }).withOpacity(0.87f)
        )
        Text("Subtitle", style = (+themeTextStyle { body2 }).withOpacity(0.87f))
        Text("Paragraph", style = (+themeTextStyle { body2 }).withOpacity(0.6f))
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        NewsStory()
    }
}
