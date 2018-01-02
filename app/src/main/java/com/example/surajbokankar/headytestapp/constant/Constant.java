package com.example.surajbokankar.headytestapp.constant;

/**
 * Created by suraj.bokankar on 21/12/17.
 */

public class Constant {

    public static String BASE_URL="https://stark-spire-93433.herokuapp.com/";

    public static  int RESPONSE_OK=200;


    public static String RESPONSE="{\n" +
            "    \"categories\": [\n" +
            "        {\n" +
            "            \"id\": 1,\n" +
            "            \"name\": \" Casuals\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 1,\n" +
            "                    \"name\": \"Nike Sneakers\",\n" +
            "                    \"date_added\": \"2016-12-09T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 1,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 1000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 2,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 1000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 3,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 1200\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 4,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 1200\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2,\n" +
            "                    \"name\": \"Adidas Running Shoes\",\n" +
            "                    \"date_added\": \"2016-11-05T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 5,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 6,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 7,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2200\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 8,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2200\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 21,\n" +
            "                    \"name\": \"Roadster Loafers\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 65,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 3500\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 66,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 3200\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 22,\n" +
            "                    \"name\": \"Light Loafers\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 67,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 68,\n" +
            "                            \"color\": \"Yellow\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2800\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 23,\n" +
            "                    \"name\": \"Floaters\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 69,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 3500\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 70,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 3500\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 2,\n" +
            "            \"name\": \"Jeans\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 3,\n" +
            "                    \"name\": \"Spykar Denim\",\n" +
            "                    \"date_added\": \"2017-01-05T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 9,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 30,\n" +
            "                            \"price\": 1200\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 10,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 32,\n" +
            "                            \"price\": 1400\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 11,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 34,\n" +
            "                            \"price\": 1400\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 12,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 36,\n" +
            "                            \"price\": 1500\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 4,\n" +
            "                    \"name\": \"Lee Cotton Jeans\",\n" +
            "                    \"date_added\": \"2017-01-25T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 13,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 30,\n" +
            "                            \"price\": 1500\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 14,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 32,\n" +
            "                            \"price\": 1500\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 15,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": 34,\n" +
            "                            \"price\": 1700\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 16,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 36,\n" +
            "                            \"price\": 1800\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 24,\n" +
            "                    \"name\": \"Denim Wash\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 71,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 30,\n" +
            "                            \"price\": 40000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 72,\n" +
            "                            \"color\": \"Grey\",\n" +
            "                            \"size\": 30,\n" +
            "                            \"price\": 35000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 25,\n" +
            "                    \"name\": \"Pepe Jeans Slim Fit\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 73,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 32,\n" +
            "                            \"price\": 35000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 74,\n" +
            "                            \"color\": \"Light Blue\",\n" +
            "                            \"size\": 32,\n" +
            "                            \"price\": 35000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 26,\n" +
            "                    \"name\": \"Spykar Funky Regular\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 75,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 34,\n" +
            "                            \"price\": 2600\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 76,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 32,\n" +
            "                            \"price\": 2800\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 7,\n" +
            "            \"name\": \"T-Shirts\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 5,\n" +
            "                    \"name\": \"Polo Collar T-Shirt\",\n" +
            "                    \"date_added\": \"2016-12-20T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 17,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 18,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 1800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 19,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 1800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 20,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 6,\n" +
            "                    \"name\": \"Adidas Nylon\",\n" +
            "                    \"date_added\": \"2017-01-28T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 21,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 22,\n" +
            "                            \"color\": \"Yellow\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 23,\n" +
            "                            \"color\": \"Green\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2200\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 24,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2200\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 27,\n" +
            "                    \"name\": \"Being Human Collar T-shirt\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 77,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2600\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 78,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2800\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 28,\n" +
            "                    \"name\": \"V - Neck Smart T-Shirt\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 79,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2600\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 80,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2800\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 29,\n" +
            "                    \"name\": \"Manchester United\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 81,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2600\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 82,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2600\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8,\n" +
            "            \"name\": \"Tracks & Trousers\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 7,\n" +
            "                    \"name\": \"Comfort Tracks\",\n" +
            "                    \"date_added\": \"2016-12-22T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 25,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 26,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 1800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 27,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 1800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 28,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 8,\n" +
            "                    \"name\": \"Adidas Trousers\",\n" +
            "                    \"date_added\": \"2017-01-20T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 29,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 30,\n" +
            "                            \"color\": \"Yellow\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 31,\n" +
            "                            \"color\": \"Green\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2200\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 32,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2200\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 30,\n" +
            "                    \"name\": \"Superdry track\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 83,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 36,\n" +
            "                            \"price\": 2600\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 84,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 38,\n" +
            "                            \"price\": 2900\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 31,\n" +
            "                    \"name\": \"Night Comfy Track\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 85,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 36,\n" +
            "                            \"price\": 3800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 86,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 32,\n" +
            "                            \"price\": 3600\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 32,\n" +
            "                    \"name\": \"Superdry Joggers\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 87,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 30,\n" +
            "                            \"price\": 2800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 88,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 32,\n" +
            "                            \"price\": 2600\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 9,\n" +
            "            \"name\": \"Formals\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 9,\n" +
            "                    \"name\": \"Bata Lace up Shoes\",\n" +
            "                    \"date_added\": \"2016-12-22T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 33,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 34,\n" +
            "                            \"color\": \"Brown\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 35,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 1800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 36,\n" +
            "                            \"color\": \"Brown\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 1800\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 10,\n" +
            "                    \"name\": \"Franco Leather\",\n" +
            "                    \"date_added\": \"2017-01-20T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 37,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 38,\n" +
            "                            \"color\": \"Brown\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 39,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2200\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 40,\n" +
            "                            \"color\": \"Brown\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 2200\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 10,\n" +
            "            \"name\": \"Shirts\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 11,\n" +
            "                    \"name\": \"Wrangler Checked Shirt\",\n" +
            "                    \"date_added\": \"2017-01-22T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 41,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 42,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 42,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 43,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 1800\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 44,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": 44,\n" +
            "                            \"price\": 1800\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 12,\n" +
            "                    \"name\": \"Printed Shirt\",\n" +
            "                    \"date_added\": \"2017-01-20T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 45,\n" +
            "                            \"color\": \"Blue\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 46,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": 40,\n" +
            "                            \"price\": 2000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 47,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": 38,\n" +
            "                            \"price\": 2200\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 48,\n" +
            "                            \"color\": \"Brown\",\n" +
            "                            \"size\": 38,\n" +
            "                            \"price\": 2200\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 14,\n" +
            "            \"name\": \"Apple\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 13,\n" +
            "                    \"name\": \"Iphone 6S\",\n" +
            "                    \"date_added\": \"2017-01-10T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 49,\n" +
            "                            \"color\": \"Silver\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 60000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 50,\n" +
            "                            \"color\": \"Golden\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 62000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 14,\n" +
            "                    \"name\": \"Iphone 7\",\n" +
            "                    \"date_added\": \"2016-12-20T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 51,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 70000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 52,\n" +
            "                            \"color\": \"Silver\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 72000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 33,\n" +
            "                    \"name\": \"Iphone 6\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 89,\n" +
            "                            \"color\": \"Silver\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 35000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 90,\n" +
            "                            \"color\": \"Golden\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 40000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 34,\n" +
            "                    \"name\": \"Iphone 6s Plus\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 91,\n" +
            "                            \"color\": \"Silver\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 64000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 92,\n" +
            "                            \"color\": \"Golden\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 66000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 35,\n" +
            "                    \"name\": \"Iphone 7 Plus\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 93,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 78000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 94,\n" +
            "                            \"color\": \"Grey\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 78000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 15,\n" +
            "            \"name\": \"Samsung\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 15,\n" +
            "                    \"name\": \"Galaxy S7 Edge\",\n" +
            "                    \"date_added\": \"2017-01-15T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 53,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 50000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 54,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 50000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 16,\n" +
            "                    \"name\": \"Galaxy J5\",\n" +
            "                    \"date_added\": \"2016-12-20T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 55,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 30000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 56,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 30000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 36,\n" +
            "                    \"name\": \"Galaxy J7\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 95,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 34000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 96,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 34000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 37,\n" +
            "                    \"name\": \"Galaxy Grand Prime\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 97,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 25000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 98,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 25000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 38,\n" +
            "                    \"name\": \"Note 4\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 99,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 40000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 100,\n" +
            "                            \"color\": \"White\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 40000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 16,\n" +
            "            \"name\": \"Dell\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 17,\n" +
            "                    \"name\": \"Dell Inspiron Core\",\n" +
            "                    \"date_added\": \"2017-01-10T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 57,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 40000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 58,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 40000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 18,\n" +
            "                    \"name\": \"Dell Inspiron 11\",\n" +
            "                    \"date_added\": \"2016-12-20T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 59,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 35000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 60,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 35000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 17,\n" +
            "            \"name\": \"Toshiba\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 19,\n" +
            "                    \"name\": \"Satellite Pro\",\n" +
            "                    \"date_added\": \"2017-01-15T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 61,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 40000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 62,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 40000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT\",\n" +
            "                        \"value\": 12.5\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 20,\n" +
            "                    \"name\": \"Satellite P50\",\n" +
            "                    \"date_added\": \"2016-01-18T11:16:11.000Z\",\n" +
            "                    \"variants\": [\n" +
            "                        {\n" +
            "                            \"id\": 63,\n" +
            "                            \"color\": \"Black\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 35000\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 64,\n" +
            "                            \"color\": \"Red\",\n" +
            "                            \"size\": null,\n" +
            "                            \"price\": 35000\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"tax\": {\n" +
            "                        \"name\": \"VAT4\",\n" +
            "                        \"value\": 4\n" +
            "                    }\n" +
            "                }\n" +
            "            ],\n" +
            "            \"child_categories\": []\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3,\n" +
            "            \"name\": \"Mens Wear\",\n" +
            "            \"products\": [],\n" +
            "            \"child_categories\": [\n" +
            "                4,\n" +
            "                5,\n" +
            "                6\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 4,\n" +
            "            \"name\": \"Bottom Wear\",\n" +
            "            \"products\": [],\n" +
            "            \"child_categories\": [\n" +
            "                2,\n" +
            "                8\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 5,\n" +
            "            \"name\": \"Foot Wear\",\n" +
            "            \"products\": [],\n" +
            "            \"child_categories\": [\n" +
            "                1,\n" +
            "                9\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 6,\n" +
            "            \"name\": \"Upper Wear\",\n" +
            "            \"products\": [],\n" +
            "            \"child_categories\": [\n" +
            "                7,\n" +
            "                10\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 11,\n" +
            "            \"name\": \"Electronics\",\n" +
            "            \"products\": [],\n" +
            "            \"child_categories\": [\n" +
            "                12,\n" +
            "                13\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 12,\n" +
            "            \"name\": \"Mobiles\",\n" +
            "            \"products\": [],\n" +
            "            \"child_categories\": [\n" +
            "                14,\n" +
            "                15\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 13,\n" +
            "            \"name\": \"Laptops\",\n" +
            "            \"products\": [],\n" +
            "            \"child_categories\": [\n" +
            "                16,\n" +
            "                17\n" +
            "            ]\n" +
            "        }\n" +
            "    ],\n" +
            "    \"rankings\": [\n" +
            "        {\n" +
            "            \"ranking\": \"Most Viewed Products\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 1,\n" +
            "                    \"view_count\": 56700\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2,\n" +
            "                    \"view_count\": 60000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 3,\n" +
            "                    \"view_count\": 74000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 4,\n" +
            "                    \"view_count\": 12000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 5,\n" +
            "                    \"view_count\": 66000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 6,\n" +
            "                    \"view_count\": 23456\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 7,\n" +
            "                    \"view_count\": 65783\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 8,\n" +
            "                    \"view_count\": 23456\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 9,\n" +
            "                    \"view_count\": 78965\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 10,\n" +
            "                    \"view_count\": 23456\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11,\n" +
            "                    \"view_count\": 65784\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 12,\n" +
            "                    \"view_count\": 34756\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 13,\n" +
            "                    \"view_count\": 67543\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 14,\n" +
            "                    \"view_count\": 20000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 15,\n" +
            "                    \"view_count\": 35000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 16,\n" +
            "                    \"view_count\": 22000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 17,\n" +
            "                    \"view_count\": 21000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 18,\n" +
            "                    \"view_count\": 28000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19,\n" +
            "                    \"view_count\": 87694\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 20,\n" +
            "                    \"view_count\": 78645\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 21,\n" +
            "                    \"view_count\": 54673\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 22,\n" +
            "                    \"view_count\": 76894\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 23,\n" +
            "                    \"view_count\": 34567\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 24,\n" +
            "                    \"view_count\": 23456\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 25,\n" +
            "                    \"view_count\": 54678\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"ranking\": \"Most OrdeRed Products\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 1,\n" +
            "                    \"order_count\": 5600\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 2,\n" +
            "                    \"order_count\": 4300\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 3,\n" +
            "                    \"order_count\": 2000\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 8,\n" +
            "                    \"order_count\": 9873\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 10,\n" +
            "                    \"order_count\": 2354\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 38,\n" +
            "                    \"order_count\": 3456\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 37,\n" +
            "                    \"order_count\": 6543\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 36,\n" +
            "                    \"order_count\": 4312\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 35,\n" +
            "                    \"order_count\": 2309\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 34,\n" +
            "                    \"order_count\": 1346\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 33,\n" +
            "                    \"order_count\": 3456\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 32,\n" +
            "                    \"order_count\": 1890\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 31,\n" +
            "                    \"order_count\": 9876\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 30,\n" +
            "                    \"order_count\": 3455\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 29,\n" +
            "                    \"order_count\": 3456\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 28,\n" +
            "                    \"order_count\": 6754\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 27,\n" +
            "                    \"order_count\": 5467\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 26,\n" +
            "                    \"order_count\": 7645\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 25,\n" +
            "                    \"order_count\": 9872\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 24,\n" +
            "                    \"order_count\": 2345\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 23,\n" +
            "                    \"order_count\": 8769\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 22,\n" +
            "                    \"order_count\": 3457\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 21,\n" +
            "                    \"order_count\": 3567\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 20,\n" +
            "                    \"order_count\": 8769\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 19,\n" +
            "                    \"order_count\": 2365\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 18,\n" +
            "                    \"order_count\": 5467\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 16,\n" +
            "                    \"order_count\": 7690\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 15,\n" +
            "                    \"order_count\": 5690\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 14,\n" +
            "                    \"order_count\": 4359\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 13,\n" +
            "                    \"order_count\": 7869\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 12,\n" +
            "                    \"order_count\": 9876\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11,\n" +
            "                    \"order_count\": 9786\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"ranking\": \"Most ShaRed Products\",\n" +
            "            \"products\": [\n" +
            "                {\n" +
            "                    \"id\": 10,\n" +
            "                    \"shares\": 1800\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 11,\n" +
            "                    \"shares\": 2600\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 12,\n" +
            "                    \"shares\": 3245\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 21,\n" +
            "                    \"shares\": 7654\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 31,\n" +
            "                    \"shares\": 2345\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 27,\n" +
            "                    \"shares\": 5670\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 16,\n" +
            "                    \"shares\": 2346\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 23,\n" +
            "                    \"shares\": 8769\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 18,\n" +
            "                    \"shares\": 4316\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 24,\n" +
            "                    \"shares\": 8654\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public static String MENU_RESPONSE="response";


    public interface  FRAGMENT_NAME{
        String MENU="MENU";
        String SORT="sort";
        String LIST="list";
    }

    public interface  DETAIL_VIEW{
        String DETAIL="detail";
    }

}
