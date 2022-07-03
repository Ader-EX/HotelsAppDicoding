package id.testing.indonesianhotels

object HotelsData {
    private val hotelPhotos = intArrayOf(R.drawable.hotel_1,
        R.drawable.hotel_2,
        R.drawable.hotel_3,
        R.drawable.hotel_4,
        R.drawable.hotel_5,
        R.drawable.hotel_6,
        R.drawable.hotel_7,
        R.drawable.hotel_8,
        R.drawable.hotel_9,
        R.drawable.hotel_10,
        R.drawable.hotel_11,
        R.drawable.hotel_12,
        R.drawable.hotel_13,
        R.drawable.hotel_14,
        R.drawable.hotel_15,
        R.drawable.hotel_16,
        R.drawable.hotel_17
    )


    private val hotelNames = arrayOf ("Good Hotel",
        "Handlery Union Hotel",
        "Hotel Caza",
        "Rui Plaza",
        "Hyatt Regency New York",
        "Hotel Zepyhr",
        "Hilton Parc 55",
        "Comfort Inn",
        "Touchstone Hotel",
        "Union Square Hotel",
        "Grand Hyatt New York",
        "Hotel Nikko",
        "The Westin St. Francis",
        "Beresford Arms",
        "Hayes valley Inn",
        "Kimpton Alton Hotel",
        "The Bartlett",
    )

    private val hotelDescription = arrayOf("This eco-friendly San Francisco hotel offers furnishings constructed from reclaimed and recycled materials.",
        "This San Francisco hotel is located in Union Square, a 5-minute walk from the Powell Street cable car line.",
        "Hotel Caza has a restaurant, outdoor swimming pool, a fitness centre and bar in San Francisco.",
        "The family-friendly Hotel Rui Plaza Fisherman's Wharf is a non-smoking accommodation that features an outdoor pool.",
        "The newly renovated Hyatt Regency San Francisco Downtown SOMA is conveniently located 140 metres from the Market Street-Kearny cable car stop.",
        "Offering a fitness centre, Hotel Zephyr San Francisco is located a short 300 metres from Pier 39 Fisherman's Wharf.",
        "This downtown San Francisco hotel is 1 block from Union Square and the Hallidie Plaza, which features a cable car stop.",
        "This San Francisco hotel is located just 5 minutes' walk from Lombard Street, the Crookedest Street in the World.",
        "Touchstone Hotel - City Center features free WiFi and an on-site local deli.",
        "This hotel is located in San Francisco’s Theatre District, across from the Curran and ACT Theaters.",
        "This San Francisco hotel in Union Square is just steps from Chinatown. On-site dining and a 24-hour gym are available for guest convenience.",
        "Situated in San Francisco, 300 metres from Union Square, Hotel Nikko San Francisco features accommodation with a bar, private parking and a terrace.",
        "Home to the historic Magneta Grandfather Clock, this luxury Union Square hotel is directly in front of a San Francisco cable car stop.",
        "Named on the National Register of Historic Places, this hotel offers Victorian charm combined with modern amenities and is located a short stroll from area attractions.",
        "Located in San Francisco’s charming Hayes Valley neighbourhood, Hayes Valley Inn is just 5 minutes’ walk from attractions such as the San Francisco War Memorial Opera House.",
        "Featuring a shared lounge, bar and free WiFi, The Bartlett Hotel and Guesthouse is situated in San Francisco.",
        "Centrally located in San Francisco just 5 minutes’ walk from shopping and dining in Union Square, Each bright room is practically furnished.")

    private val hoteltoCentre = arrayOf("150 m from centre",
        "2.3 km from centre",
        "2.7 km from beach",
        "200 m from centre ",
        "450 m from centre",
        "2.2 km from centre",
        "2.1 km from centre",
        "350 m from centre",
        "1.8 km from centre",
        "250 m from centre",
        "0.5 km from centre",
        "3 km from beach",
        "1 km from centre",
        "1.3 km from beach",
        "350 m from centre",
        "450 m from centre",
        "750 m from centre",
    )

    private val hotelPrice = arrayOf("Starts From Rp10.000.000",
    "Starts From Rp700.000",
    "Starts From Rp538.000",
    "Starts From Rp498.000",
    "Starts From Rp978.000",
    "Starts From Rp897.000",
    "Starts From Rp390.000",
    "Starts From Rp1.900.000",
    "Starts From Rp4.390.000",
    "Starts From Rp2.923.000",
    "Starts From Rp20.011.000",
    "Starts From Rp7.240.000",
    "Starts From Rp2.138.000",
        "Starts From Rp1.139.000",
        "Starts From Rp5.120.000",
        "Starts From Rp3.432.310",
        "Starts From Rp219.000"
    )

    private val  hotelAddress = arrayOf("Downtown San Francisco, San Francisco",
        "Union Square, San Francisco",
        "Fisherman's Wharf, San Fransisco",
        "Fisherman's Wharf, San Fransisco",
        "Union Square, San Francisco",
        "Union Square, San Francisco",
        "Nob Hill, San Fransisco",
        "Marina District, San Francisco",
        "Financial District, San Francisco",
        "Chinatown District, San Fransisco",
        "Western Addition, San Francisco",
        "Henderson, Las Vegas",
        "Las Vegas Strip, Las Vegas",
        "North Beach, San Francisco",
        "Hayes Valley, San Francisco",
        "Sunset District, San Francisco",
        "Western Addition, San Francisco")





    val listData : ArrayList<Hotel>
    get() {
        val list = arrayListOf<Hotel>()
        for (position in hotelNames.indices){
            val hotel = Hotel()
            hotel.name = hotelNames[position]
            hotel.desc = hotelDescription[position]
            hotel.photo = hotelPhotos[position]
            hotel.address = hotelAddress[position]
            hotel.tocentre = hoteltoCentre[position]
            hotel.price = hotelPrice[position]
            list.add(hotel)
        }
        return list
    }

}