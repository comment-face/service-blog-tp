package com.meice.servicemeice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class test {
    private static final Logger LOGGER = LoggerFactory.getLogger(test.class);
    public static void main(String[] args) throws Exception {
//        String para = "{\n" +
//                "    \"code\": \"200\",\n" +
//                "    \"complexion\": 5,\n" +
//                "    \"datas\": [\n" +
//                "        {\n" +
//                "            \"picMap\": null,\n" +
//                "            \"picMapForOSS\": {\n" +
//                "                \"HyperPigmentation.png\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/HyperPigmentation.png\",\n" +
//                "                \"wood.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/wood.jpg\",\n" +
//                "                \"Acne.png\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/Acne.png\",\n" +
//                "                \"SurfaceSpotSpecialEffect.jpg\": null,\n" +
//                "                \"uv.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/uv.jpg\",\n" +
//                "                \"cross.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/cross.jpg\",\n" +
//                "                \"Pigmentation.png\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/Pigmentation.png\",\n" +
//                "                \"Pore.png\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/Pore.png\",\n" +
//                "                \"PigmentationAging.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/PigmentationAging.jpg\",\n" +
//                "                \"Wrinkle.png\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/Wrinkle.png\",\n" +
//                "                \"WrinkleAging.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/WrinkleAging.jpg\",\n" +
//                "                \"WrinkleRemovalResult.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/WrinkleRemovalResult.jpg\",\n" +
//                "                \"UVHighContrast.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/UVHighContrast.jpg\",\n" +
//                "                \"SensitiveArea.png\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/SensitiveArea.png\",\n" +
//                "                \"RedSpotSpecialEffect.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/RedSpotSpecialEffect.jpg\",\n" +
//                "                \"daylight.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/daylight.jpg\",\n" +
//                "                \"SpotRemovalResult.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/SpotRemovalResult.jpg\",\n" +
//                "                \"parallel.jpg\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4/parallel.jpg\"\n" +
//                "            },\n" +
//                "            \"reportDatas\": [\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \"cross.jpg\",\n" +
//                "                        \"Pigmentation.png\"\n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": 0.044883247,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": 161,\n" +
//                "                    \"ratio\": 0.36907363,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"Pigmentation\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \"uv.jpg\",\n" +
//                "                        \"HyperPigmentation.png\"\n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": 0.13510582,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": 421,\n" +
//                "                    \"ratio\": 0.43976617,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"HyperPigmentation\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \"uv.jpg\",\n" +
//                "                        \"Acne.png\"\n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": -1,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": 204,\n" +
//                "                    \"ratio\": 0.31557387,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"Acne\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \"parallel.jpg\",\n" +
//                "                        \"Pore.png\"\n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": -1,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": 130,\n" +
//                "                    \"ratio\": 0.14342004,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 130,\n" +
//                "                    \"symptom\": \"Pore\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \"cross.jpg\",\n" +
//                "                        \"SensitiveArea.png\"\n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": 0.09752484,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": 97,\n" +
//                "                    \"ratio\": 0.4893164,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"SensitiveArea\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \"parallel.jpg\",\n" +
//                "                        \"Wrinkle.png\"\n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": 0.0028465232,\n" +
//                "                    \"deepWrinkles\": 8,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 118,\n" +
//                "                    \"longWrinkles\": 8,\n" +
//                "                    \"number\": 244,\n" +
//                "                    \"ratio\": 0.23812395,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 118,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"Wrinkle\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": 0.22674817,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": 685,\n" +
//                "                    \"ratio\": 0.70606333,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"UVHighContrast\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": -1,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": -1,\n" +
//                "                    \"ratio\": -1,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"RedSpotSpecialEffect\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": -1,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": -1,\n" +
//                "                    \"ratio\": -1,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"SurfaceSpotSpecialEffect\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": -1,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": -1,\n" +
//                "                    \"ratio\": -1,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"PigmentationAging\"\n" +
//                "                },\n" +
//                "                {\n" +
//                "                    \"analysePicUrls\": [\n" +
//                "                        \n" +
//                "                    ],\n" +
//                "                    \"areaRatio\": -1,\n" +
//                "                    \"deepWrinkles\": 0,\n" +
//                "                    \"largePores\": 0,\n" +
//                "                    \"lightWrinkles\": 0,\n" +
//                "                    \"longWrinkles\": 0,\n" +
//                "                    \"number\": -1,\n" +
//                "                    \"ratio\": -1,\n" +
//                "                    \"reportTime\": \"2019-01-15 13:35:04\",\n" +
//                "                    \"shortWrinkles\": 0,\n" +
//                "                    \"skinAge\": 5,\n" +
//                "                    \"smallPores\": 0,\n" +
//                "                    \"symptom\": \"WrinkleAging\"\n" +
//                "                }\n" +
//                "            ],\n" +
//                "            \"scaledPicMap\": null\n" +
//                "        }\n" +
//                "    ],\n" +
//                "    \"extra\": \"phone=18520128736\",\n" +
//                "    \"faceDirection\": \"frontal\",\n" +
//                "    \"message\": \"分析结果处理成功\",\n" +
//                "    \"opticalCapability\": 5,\n" +
//                "    \"shootgroupid\": \"\",\n" +
//                "    \"shootid\": \"078854f0-420c-4e7f-ad3a-eba69336c0b4\",\n" +
//                "    \"status\": \"S\",\n" +
//                "    \"synAge\": 5,\n" +
//                "    \"synScore\": 60.456245,\n" +
//                "    \"token\": \"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmMzBmNzc4MC05NDA4LTQ0OTctOThkOC05NWYzZjg0NjNiMjEiLCJ1c2VyX3V1aWQiOiJoY3Z1N3QiLCJleHAiOjE1NDg3Mzk0MjQsImlhdCI6MTU0NzUyOTgyNH0.WzCTwQuHkFfuKrnrIc_OPpTJXtn4vnC9Qr59zigq6kaFt0Zn5dY32psqrFemVXFLZEtN1sAsi-zMYrHjfWTs1w\"\n" +
//                "}";
//
//        String url = "https://www.muaskin.com/api/pub/meice/notify";
//       String re =  httpClientUtil.sendHttpPostJson(url,para);
//        System.out.print(re);



//        沈发龙 11:16:08
//        47.100.28.94     administrator
//
//                Mcapp213391008187
//        沈发龙 11:21:27
//        Mcapp13391008187
//        沈发龙 11:21:52
//        application52349MC566
//
//
//        76be8f77-fea7-40ef-b0e4-952c3c6e4886

        List<Integer> arr = new ArrayList();
        for (int j = 1 ; j<30 ; j++){
            arr.add(j);
        }

        List<Integer> arr2 = new ArrayList();

        for (int i = 0 ; i<arr.size() ; i+=3){

                arr2.add(arr.get(i));
                arr2.add(arr.get(i + 1));
            if (i+2!=arr.size()) {
                arr2.add(arr.get(i + 2));
            }
                System.out.println(arr2.size());
        }


    }
}
