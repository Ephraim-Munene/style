package net.ezra.ui.home

import android.content.Intent
import android.net.Uri
import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_DESIGN
import net.ezra.navigation.ROUTE_SHIR1
import net.ezra.navigation.ROUTE_SHIR2
import net.ezra.navigation.ROUTE_SHIR3
import net.ezra.navigation.ROUTE_SHIR4
import net.ezra.navigation.ROUTE_SHOES1
import net.ezra.navigation.ROUTE_SHOES2
import net.ezra.navigation.ROUTE_SHOES3
import net.ezra.navigation.ROUTE_SHOES4
import net.ezra.navigation.ROUTE_TROUSER1
import net.ezra.navigation.ROUTE_TROUSER2
import net.ezra.navigation.ROUTE_TROUSER3
import net.ezra.navigation.ROUTE_TROUSER4
import net.ezra.navigation.ROUTE_VAR
import net.ezra.navigation.ROUTE_VAR2
import net.ezra.navigation.ROUTE_VAR3
import net.ezra.navigation.ROUTE_VAR4


@Composable
fun HomeScreen(navController: NavHostController) {




        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)

        ) {
//        Image(painter = painterResource(id = R.drawable.imge), contentDescription = "",
//            modifier = Modifier
//                .fillMaxSize(),
//
//            contentScale = ContentScale.Crop
//        )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
//                .padding(10.dp)
                    .padding(top = 10.dp)

            ) {
                Spacer(modifier = Modifier.height(30.dp))

                Row {

                    Text(text = "Style", fontSize = 35.sp, color = Color.Black)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Quest",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 35.sp
                    )


//                    Image(painter = painterResource(id = R.drawable.cart), contentDescription = "")
                }


                Spacer(modifier = Modifier.height(20.dp))


                LazyColumn {
                    item {
                        Text(text = "Shoes", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            LazyRow {
                                item {
                                    Card(
                                        Item = "Air Force 1",
                                        description = "Step into comfort and style with our breathable, lightweight sneakers—perfect for active lifestyles.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.shoes1),
                                        destination = ROUTE_SHOES1, // Provide the destination route
                                        navController = navController,
//                                    isCircle = true
                                    )

                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "UI/UX Courses",
                                        description = "Elevate your look with our sleek, timeless leather shoes designed for both casual and formal wear.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.shoes2),
                                        destination = ROUTE_SHOES2, // Provide the destination route
                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "UI/UX Courses",
                                        description = "discover the ultimate running companion with our high-performance shoes engineered for speed and durability.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.shoes3),
                                        destination = ROUTE_SHOES3, // Provide the destination route
                                        navController = navController
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "UI/UX Courses",
                                        description = "Make a bold statement with our vibrant, eco-friendly sneakers that fuse fashion with sustainability.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.shoes4),
                                        destination = ROUTE_SHOES4, // Provide the destination route
                                        navController = navController
                                    )
                                }
                            }
                        }


                        Text(
                            text = "T-shirts",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            LazyRow {
                                item {
                                    Card(
                                        Item = "Shirt1",
                                        description = "Unwind in supreme comfort with our soft, breathable t-shirts, perfect for everyday relaxation.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.shirt1),
                                        destination = ROUTE_SHIR1, // Provide the destination route
                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "Shirt2",
                                        description = "Elevate your casual attire with our classic-fit t-shirts, blending comfort with timeless style.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.shirt2),
                                        destination = ROUTE_SHIR2, // Provide the destination route
                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "Shirt3",
                                        description = "Embrace versatility with our moisture-wicking t-shirts, ideal for workouts or outdoor adventures.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.shirt3),
                                        destination = ROUTE_SHIR3, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "Shirt4",
                                        description = "Express yourself in vibrant colors with our eco-friendly t-shirts, crafted for sustainable fashion enthusiasts.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.shirt4),
                                        destination = ROUTE_SHIR4, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))

                                }
                            }
                        }


                        Text(text = "Trousers", fontSize = 25.sp, fontWeight = FontWeight.Bold)

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            LazyRow {
                                item {
                                    Card(
                                        Item = "Trouser",
                                        description = "Experience all-day comfort and versatility in our tailored trousers, crafted for effortless sophistication",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.trouser1),
                                        destination = ROUTE_TROUSER1, // Provide the destination route

                                        navController = navController
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))

                                    Card(
                                        Item = "Formal",
                                        description = "Achieve a polished look with our premium cotton trousers, ideal for work or weekend outings.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.trouser2),
                                        destination = ROUTE_TROUSER2, // Provide the destination route

                                        navController = navController
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "Cargo",
                                        description = "Explore freedom of movement in our stretchable, durable trousers designed for active professionals.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.trouser3),
                                        destination = ROUTE_TROUSER3, // Provide the destination route

                                        navController = navController
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "Trouser4",
                                        description = "Stay stylish and cozy in our winter-ready trousers, featuring warmth without compromising on style.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.trouser4),
                                        destination = ROUTE_TROUSER4, // Provide the destination route

                                        navController = navController
                                    )

                                    Spacer(modifier = Modifier.width(20.dp))


                                }
                            }
                        }




                        Text(text = "Varsity jackets", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            LazyRow {
                                item {
                                    Card(
                                        Item = "Varsity1",
                                        description = "Celebrate achievements in our iconic varsity jackets, blending tradition with modern style and comfort.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.varsity1),
                                        destination = ROUTE_VAR, // Provide the destination route

                                        navController = navController,
//                                            isCircle = true // This card will be displayed as a circle

                                    )
                                    Spacer(modifier = Modifier.width(20.dp))

                                    Card(
                                        Item = "Varsity2",
                                        description = "Stand out in our customizable varsity jackets, perfect for showcasing team pride or personal flair",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.varsity2),
                                        destination = ROUTE_VAR2, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "Varsity3",
                                        description = "Embrace warmth and durability in our classic varsity jackets, ideal for cool weather adventures.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.varsity3),
                                        destination = ROUTE_VAR3, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )

                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        Item = "Varsity4",
                                        description = "Make a statement with our retro-inspired varsity jackets, crafted for timeless fashion enthusiasts.",
                                        icon = painterResource(id = R.drawable.cart),
                                        image = painterResource(id = R.drawable.varsity4),
                                        destination = ROUTE_VAR4, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )

                                    Spacer(modifier = Modifier.height(50.dp))

                                }
                            }

                        }


                    }
                }


            }
        }


}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}
@Composable
fun Card(
    Item: String,
    description: String,
    icon: Painter,
    image: Painter,
    destination: String,
    navController: NavHostController
) {
    Spacer(modifier = Modifier.height(16.dp))
    Card(
        modifier = Modifier
            .width(350.dp) // Set a fixed width for the card
            .padding(horizontal = 8.dp)
            .shadow(elevation = 10.dp)


        // Add padding to reduce card size horizontally

    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White)

        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp) // Add padding around the image
                    .height(150.dp), // Reduce the height of the image
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp)) // Reduce vertical spacing
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Row {

                        Icon(
                            painter = icon,
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp)) // Reduce horizontal spacing
                        Text(
                            text = Item,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Reduce horizontal spacing
                    Text(
                        text = description,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Reduce horizontal spacing
                    OutlinedButton(
                        onClick = {
                            navController.navigate(destination)
                        },
//                        modifier = Modifier.align(Alignment.CenterVertically)
                    ){
                        Text(text = "View Item", color = Color.Black)
                    }
                }



            }
        }
    }
}





