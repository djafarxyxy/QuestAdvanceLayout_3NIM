package com.example.latihan3

import android.graphics.drawable.shapes.OvalShape
import android.preference.PreferenceActivity.Header
import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActifity(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray)
    ) {
        HeaderSection()
        Text(text = "Kepada Yth")
        Text(text = "Farhan Naim Djafar")
        Spacer(modifier = Modifier.size(50.dp))
        DetailSurat(
            judul = "Nama",
            isi = "Ilzam Roin Musyafa"
        )
        DetailSurat(
            judul = "Email",
            isi = "farhan@gmail.com"
        )
        DetailSurat(
            judul = "NoTlp",
            isi = "20220140018"
        )
        DetailSurat(
            judul = "Keterangan",
            isi = "hai sobat"
        )

    }
}

fun Image(painter: Painter) {

}

@Composable
fun HeaderSection(){
    Box(modifier = Modifier.fillMaxWidth().background(color = Color.DarkGray).padding(16.dp)){
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column {
                Text(text = "Daerah Istimewah Yogyakarta",
                    color = Color.Black
                    )
                Text(text = "FAX : 021-212121, tlp: 0874627742749",
                    color = Color.Black
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ){
                Image(painter = painterResource(id = R.drawable.realmadrid),
                    contentDescription = "King UCL",
                    modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                    )
                Icon(imageVector = Icons.Default.Done,
                    contentDescription = null
                )
            }
        }
    }
}
@Composable
fun DetailSurat(
    judul: String, isi: String
){
    Column (
        modifier = Modifier.fillMaxWidth()
    ){
        Row (
            modifier = Modifier.fillMaxWidth().padding(2.dp)
        ){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isi,
                modifier = Modifier.weight(2f))

        }
    }
}

