data class Place(
    val id: Int, // — идентификатор места (если назначено);
    val title:String,// — название места (если назначено);
    val latitude:Int,// — географическая широта;
    val longitude:Int,// — географическая долгота;
    val created:Int,// — дата создания (если назначено);
    val icon: String,// — URL изображения-иконки;
    val country:String,// — название страны;
    val city:String,// — название города;
)