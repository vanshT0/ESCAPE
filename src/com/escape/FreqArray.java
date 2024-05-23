public class FreqArray{
    public void sortColors(int[] nums) {
        int minIndex ;
        for(int i = 0; i < nums.length; i++){
            minIndex = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    
}


//Cows and bulls
    public String getHint(String secret, String guess) {
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        int bulls = 0;
        char sChar, gChar;
        for (int i = 0; i < secret.length(); i++) {
            sChar = secret.charAt(i);
            gChar = guess.charAt(i);
            if (sChar == gChar) {
                bulls++;
            } else {
                secretCount[sChar - '0']++;
                guessCount[gChar - '0']++;
            }
        }
        int cows = 0;
        for (int i = 0; i < secretCount.length; i++) {
            cows += Math.min(secretCount[i], guessCount[i]);
        }
        return new StringBuilder().append(bulls).append('A').append(cows).append('B').toString();
    }


}

// }



//         "_id": "6621085ce4b0982f29b5e140",
//         "log": "Sample log content",
//         "memberuid": 50541205,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2024-04-18T10:05:00Z",
//         "template": "Sample template content",
//         "templateNumber": "Sample operator response"
//     },
//     {
//         "_id": "6621085ce4b0982f29b5e141",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4ig5904040i1b110000lhm4lMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 7533041,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4ig5904040i1b110000lhm4lMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4ig5904040i1b110000lhm4lMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "6621085ce4b0982f29b5e13f",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4ig5642066j1b110000g3peoMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 7533041,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4ig5642066j1b110000g3peoMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4ig5642066j1b110000g3peoMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "66210a50e4b0982f29b5e142",
//         "log": "Sample log content",
//         "memberuid": 50541205,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2024-04-18T10:05:00Z",
//         "template": "Sample template content",
//         "templateNumber": "Sample operator response"
//     },
//     {
//         "_id": "66210a6ae4b0982f29b5e143",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='8585952190', refId='ko4ih2626405i1b110000q1acnMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 122471942,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8585952190', refId='ko4ih2626405i1b110000q1acnMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8585952190', refId='ko4ih2626405i1b110000q1acnMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "6621198ce4b0867688801d3e",
//         "log": "Sample log content",
//         "memberuid": 103092432,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2025-04-18T10:05:00Z",
//         "template": "Test1",
//         "templateNumber": "Sample operator response"
//     },
//     {
//         "_id": "66221337e4b07b71e7451f13",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='7795709569', refId='otp-mobiotp-1713509172344-7577-3', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='null'}|",
//         "memberuid": 8320979,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='7795709569', refId='otp-mobiotp-1713509172344-7577-3', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='7795709569', refId='otp-mobiotp-1713509172344-7577-3', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}"
//     },
//     {
//         "_id": "662213a6e4b07b71e7451f14",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='7795709569', refId='ko4jc1806517h1b1100009bdeqMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 8320979,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='7795709569', refId='ko4jc1806517h1b1100009bdeqMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='7795709569', refId='ko4jc1806517h1b1100009bdeqMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "66221653e4b07b71e7451f15",
//         "log": "Sample log content",
//         "memberuid": 103092432,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2025-04-19T10:05:00Z",
//         "template": "Test1",
//         "templateNumber": "Sample operator response"
//     },
//     {
//         "_id": "66222918e4b003fc1c85196c",
//         "createdAt": "2024-04-19T08:19:36.057Z",
//         "encryptedCellNumber": "OBZu52v6IqrQhaj4H0/7Yg==",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='7042338867', refId='c2cb9b0a-18ec-4a40-aeb4-eb0568532854', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='null'}|",
//         "memberuid": 42381144,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='7042338867', refId='c2cb9b0a-18ec-4a40-aeb4-eb0568532854', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='8'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='7042338867', refId='c2cb9b0a-18ec-4a40-aeb4-eb0568532854', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='8'}"
//     },
//     {
//         "_id": "66223461e4b003fc1c85196d",
//         "createdAt": "2024-04-19T09:07:45.970Z",
//         "encryptedCellNumber": "W9UruV9E9tc6kBgpFT7TuQ==",
//         "log": "Sample log content",
//         "memberuid": 103092432,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2025-04-19T10:05:00Z",
//         "template": "Test1",
//         "templateNumber": "Sample operator response"
//     },
//     {
//         "_id": "66223490e4b003fc1c85196e",
//         "createdAt": "2024-04-19T09:08:32.371Z",
//         "encryptedCellNumber": "mGBGKsOHc6HLGqScVXrGgw==",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4je3832233k1b110000k4gnaMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 152040662,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4je3832233k1b110000k4gnaMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4je3832233k1b110000k4gnaMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "66223532e4b003fc1c85196f",
//         "createdAt": "2024-04-19T09:11:14.202Z",
//         "encryptedCellNumber": "QI+9ipQset7xasKs1+UvrA==",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='otp-mobiotp-1713517874129-9318-2', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='null'}|",
//         "memberuid": 116852329,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='otp-mobiotp-1713517874129-9318-2', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='otp-mobiotp-1713517874129-9318-2', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}"
//     },
//     {
//         "_id": "66223802e4b003fc1c851970",
//         "createdAt": "2024-04-19T09:23:14.947Z",
//         "encryptedCellNumber": "QI+9ipQset7xasKs1+UvrA==",
//         "log": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='ko4je5314471h1b1100004rezhMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 116852329,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='ko4je5314471h1b1100004rezhMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTPTEMPLATEFORPASSWORD",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='ko4je5314471h1b1100004rezhMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "66223abfe4b08b47a3ce8800",
//         "createdAt": "2024-04-19T09:34:55.689Z",
//         "encryptedCellNumber": "mGBGKsOHc6HLGqScVXrGgw==",
//         "log": "OTPTEMPLATEFORPASSWORD|OTP for your MobiKwik Account Login is 101813. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.|posting request for 8588964839 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=2, priority=0, url='http://sms6.rmlconnect.net/bulksms/bulksms'}|1701|918588964839:05601a4e-4570-4590-9d41-92b4e1e87c68|SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='05601a4e-4570-4590-9d41-92b4e1e87c68', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='null'}|",
//         "memberuid": 152040662,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='05601a4e-4570-4590-9d41-92b4e1e87c68', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='8'}",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='05601a4e-4570-4590-9d41-92b4e1e87c68', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='8'}"
//     },
//     {
//         "_id": "66223afae4b08b47a3ce8801",
//         "createdAt": "2024-04-19T09:35:54.434Z",
//         "encryptedCellNumber": "mGBGKsOHc6HLGqScVXrGgw==",
//         "log": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.|OTPTEMPLATEFORPASSWORD|posting request for 8588964839 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=7, priority=0, url='https://http.myvfirst.com/smpp/sendsms'}|guid=ko4jf0554342k1b1100002rpy2MOBIKWIKHT&errorcode=0&seqno=918588964839|SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4jf0554342k1b1100002rpy2MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 152040662,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4jf0554342k1b1100002rpy2MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4jf0554342k1b1100002rpy2MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "66223ef7e4b08b47a3ce8802",
//         "createdAt": "2024-04-19T09:52:55.407Z",
//         "encryptedCellNumber": "yqD8viZn/7QF2bx7haaoBw==",
//         "log": "OTPTEMPLATEFORPASSWORD|OTP for your MobiKwik Account Login is 547372. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.|posting request for 9571445566 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=7, priority=0, url='https://http.myvfirst.com/smpp/sendsms'}|guid=ko4jf2255167k1b1100008hz6eMOBIKWIKHT&errorcode=0&seqno=919571445566|SMSGatewayResponseDTO{success=true, cellNumber='9571445566', refId='ko4jf2255167k1b1100008hz6eMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 16939834,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='9571445566', refId='ko4jf2255167k1b1100008hz6eMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='9571445566', refId='ko4jf2255167k1b1100008hz6eMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "66224c4ae4b08b47a3ce8803",
//         "createdAt": "2024-04-19T10:49:46.825Z",
//         "encryptedCellNumber": "RuuGEMjMXXGuRHMvEX9FUA==",
//         "log": "OTPTEMPLATEFORPASSWORD|OTP for your MobiKwik Account Login is 877137. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.|posting request for 8527029916 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=5, priority=0, url='https://otp2.aclgateway.com/OTP_ACL_Web/OtpRequestListener'}|otp-mobiotp-1713523786723-6699-1|SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='otp-mobiotp-1713523786723-6699-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='null'}|",
//         "memberuid": 7533041,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='otp-mobiotp-1713523786723-6699-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='otp-mobiotp-1713523786723-6699-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}"
//     },
//     {
//         "_id": "662259dee4b08b47a3ce8804",
//         "createdAt": "2024-04-19T11:47:42.494Z",
//         "encryptedCellNumber": "QI+9ipQset7xasKs1+UvrA==",
//         "log": "OTPTEMPLATEFORPASSWORD|OTP for your MobiKwik Account Login is 751886. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.|posting request for 8920569705 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=7, priority=0, url='https://http.myvfirst.com/smpp/sendsms'}|guid=ko4jh1742368h1b110000zpkk5MOBIKWIKHT&errorcode=0&seqno=918920569705|SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='ko4jh1742368h1b110000zpkk5MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 116852329,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='ko4jh1742368h1b110000zpkk5MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='ko4jh1742368h1b110000zpkk5MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "662259f9e4b08b47a3ce8805",
//         "createdAt": "2024-04-19T11:48:09.129Z",
//         "encryptedCellNumber": "RuuGEMjMXXGuRHMvEX9FUA==",
//         "log": "OTPTEMPLATEFORPASSWORD|OTP for your MobiKwik Account Login is 339728. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.|posting request for 8527029916 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=7, priority=0, url='https://http.myvfirst.com/smpp/sendsms'}|guid=ko4jh1809044h1b110000xbyjkMOBIKWIKHT&errorcode=0&seqno=918527029916|SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4jh1809044h1b110000xbyjkMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}|",
//         "memberuid": 7533041,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4jh1809044h1b110000xbyjkMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8527029916', refId='ko4jh1809044h1b110000xbyjkMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "66225b54e4b08b47a3ce8806",
//         "createdAt": "2024-04-19T11:53:56.543Z",
//         "encryptedCellNumber": "QI+9ipQset7xasKs1+UvrA==",
//         "log": "OTPTEMPLATEFORPASSWORD|OTP for your MobiKwik Account Login is 530787. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.|posting request for 8920569705 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=5, priority=0, url='https://otp2.aclgateway.com/OTP_ACL_Web/OtpRequestListener'}|otp-mobiotp-1713527636426-5614-1|SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='otp-mobiotp-1713527636426-5614-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='null'}|",
//         "memberuid": 116852329,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='otp-mobiotp-1713527636426-5614-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8920569705', refId='otp-mobiotp-1713527636426-5614-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}"
//     },
//     {
//         "_id": "66226891e4b0e46e5e3b6428",
//         "createdAt": "2024-04-19T12:50:25.707Z",
//         "encryptedCellNumber": "mGBGKsOHc6HLGqScVXrGgw==",
//         "log": "OTPTEMPLATEFORPASSWORD  |  OTP for your MobiKwik Account Login is 560123. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.  |  2024-04-19T18:20:24.346Z  |  posting request for 8588964839 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=7, priority=0, url='https://http.myvfirst.com/smpp/sendsms'}  |  guid=ko4ji2024418j1b110000xjjlwMOBIKWIKHT&errorcode=0&seqno=918588964839  |  SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4ji2024418j1b110000xjjlwMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}  |  ",
//         "memberuid": 152040662,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4ji2024418j1b110000xjjlwMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "requestTime": "2024-04-19T12:50:24.575Z",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8588964839', refId='ko4ji2024418j1b110000xjjlwMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "6625f48ce4b0e46e4617f699",
//         "createdAt": "2024-04-22T05:24:28.047Z",
//         "encryptedCellNumber": "KVl0sJlw0linIUEWUH9amg==",
//         "log": "OTPTEMPLATEFORPASSWORD  |  OTP for your MobiKwik Account Login is 124662. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.  |  2024-04-22T10:54:26.108Z  |  posting request for 7838685037 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=5, priority=0, url='https://otp2.aclgateway.com/OTP_ACL_Web/OtpRequestListener'}  |  otp-mobiotp-1713763466277-4481-1  |  SMSGatewayResponseDTO{success=true, cellNumber='7838685037', refId='otp-mobiotp-1713763466277-4481-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='null'}  |  ",
//         "memberuid": 131404894,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='7838685037', refId='otp-mobiotp-1713763466277-4481-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}",
//         "requestTime": "2024-04-22T05:24:26.397Z",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='7838685037', refId='otp-mobiotp-1713763466277-4481-1', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ACL, smsChannelId='15'}"
//     },
//     {
//         "_id": "662604eee4b0e46e4617f69a",
//         "createdAt": "2024-04-22T06:34:22.114Z",
//         "encryptedCellNumber": "QTjcfCsAz72ehju+rQjmZg==",
//         "log": "OTPTEMPLATEFORPASSWORD  |  OTP for your MobiKwik Account Login is 421701. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.  |  2024-04-22T12:04:21.883Z  |  posting request for 7792018585 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=7, priority=0, url='https://http.myvfirst.com/smpp/sendsms'}  |  guid=ko4mc0421942h1b110000yzdsdMOBIKWIKHT&errorcode=0&seqno=917792018585  |  SMSGatewayResponseDTO{success=true, cellNumber='7792018585', refId='ko4mc0421942h1b110000yzdsdMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}  |  ",
//         "memberuid": 128270992,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='7792018585', refId='ko4mc0421942h1b110000yzdsdMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "requestTime": "2024-04-22T06:34:21.997Z",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='7792018585', refId='ko4mc0421942h1b110000yzdsdMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "66388ce0e4b0c567b06cab65",
//         "createdAt": "2024-05-06T07:55:12.309Z",
//         "encryptedCellNumber": "6k1uSUDwXLjIxBcpBHMFKw==",
//         "log": "OTPTEMPLATEFORPASSWORD  |  OTP for your MobiKwik Account Login is 425934. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.  |  2024-05-06T13:25:11.959Z  |  posting request for 8806001662 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=7, priority=0, url='https://http.myvfirst.com/smpp/sendsms'}  |  guid=ko56d2512026f1b110a00lp3xfMOBIKWIKHT&errorcode=0&seqno=918806001662  |  SMSGatewayResponseDTO{success=true, cellNumber='8806001662', refId='ko56d2512026f1b110a00lp3xfMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}  |  ",
//         "memberuid": 8071084,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8806001662', refId='ko56d2512026f1b110a00lp3xfMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "requestTime": "2024-05-06T07:55:12.109Z",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8806001662', refId='ko56d2512026f1b110a00lp3xfMOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "664c4b96e4b0e2e85b61d436",
//         "createdAt": "2024-05-21T07:21:58.219Z",
//         "encryptedCellNumber": "W9UruV9E9tc6kBgpFT7TuQ==",
//         "log": "Sample log content",
//         "memberuid": 103092432,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2025-05-19T10:05:00Z",
//         "template": "Test1",
//         "templateNumber": "Sample operator response"
//     },
//     {
//         "_id": "664c4bb2e4b0e2e85b61d437",
//         "createdAt": "2024-05-21T07:22:26.213Z",
//         "encryptedCellNumber": "680mDNGMrAfG9q/x27OnOA==",
//         "log": "Sample log content",
//         "memberuid": 55460175,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2025-05-19T10:05:00Z",
//         "template": "Test1",
//         "templateNumber": "Sample operator response"
//     },
//     {
//         "_id": "664c4c91e4b0e2e85b61d438",
//         "createdAt": "2024-05-21T07:26:09.185Z",
//         "encryptedCellNumber": "nUViIx4mHShBSiORzM1PKw==",
//         "log": "OTPTEMPLATEFORPASSWORD  |  OTP for your MobiKwik Account Login is 502872. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.  |  2024-05-21T12:56:08.976Z  |  posting request for 8095662395 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=7, priority=0, url='https://http.myvfirst.com/smpp/sendsms'}  |  guid=ko5lc5609039g1b110a007jiz4MOBIKWIKHT&errorcode=0&seqno=918095662395  |  SMSGatewayResponseDTO{success=true, cellNumber='8095662395', refId='ko5lc5609039g1b110a007jiz4MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='null'}  |  ",
//         "memberuid": 139772303,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='8095662395', refId='ko5lc5609039g1b110a007jiz4MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}",
//         "requestTime": "2024-05-21T07:26:09.118Z",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='8095662395', refId='ko5lc5609039g1b110a007jiz4MOBIKWIKHT', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=VALUE_FIRST, smsChannelId='18'}"
//     },
//     {
//         "_id": "664c59c5e4b08be9166d89bb",
//         "createdAt": "2024-05-21T08:22:29.474Z",
//         "encryptedCellNumber": "TCJ14MXD81lM6qsybekP0w==",
//         "log": "OTPTEMPLATEFORPASSWORD|com.mobikwik.shared.entity.payments.SmsTemplates@3c04b427|2024-05-21T13:52:28.608Z|posting request for 9958437430 template OTPTEMPLATEFORPASSWORD channel SmsChannel{aggregator=2, priority=0, url='http://sms6.rmlconnect.net/bulksms/bulksms'}|1701|919958437430:ad1868ec-aa65-4ac3-8ad7-65e2b5cddec4|SMSGatewayResponseDTO{success=true, cellNumber='9958437430', refId='ad1868ec-aa65-4ac3-8ad7-65e2b5cddec4', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='null'}|",
//         "memberuid": 42329143,
//         "operatorResponse": "SMSGatewayResponseDTO{success=true, cellNumber='9958437430', refId='ad1868ec-aa65-4ac3-8ad7-65e2b5cddec4', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='8'}",
//         "requestTime": "2024-05-21T08:22:28.706Z",
//         "template": "OTP for your MobiKwik Account Login is @otpvalue@. Don't share it with anyone. We don't call/email you to verify OTP. OTP is valid for 5 mins.",
//         "templateNumber": "SMSGatewayResponseDTO{success=true, cellNumber='9958437430', refId='ad1868ec-aa65-4ac3-8ad7-65e2b5cddec4', responseDesc='null', templateId=5128, message='message sent', smsGatewayEnum=ROUTE_MOBILE, smsChannelId='8'}"
//     },
//     {
//         "_id": "664c5b44e4b08be9166d89bc",
//         "createdAt": "2024-05-21T08:28:52.047Z",
//         "encryptedCellNumber": "680mDNGMrAfG9q/x27OnOA==",
//         "log": "Sample log content",
//         "memberuid": 55460175,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2025-05-19T10:05:00Z",
//         "template": "Test1",
//         "templateNumber": "Sample operator response"
//     },
//     {
//         "_id": "664c5bf2e4b08be9166d89bd",
//         "createdAt": "2024-05-21T08:31:46.889Z",
//         "encryptedCellNumber": "680mDNGMrAfG9q/x27OnOA==",
//         "log": "Sample log content",
//         "memberuid": 55460175,
//         "operatorResponse": "Sample operator response",
//         "requestTime": "2025-05-19T10:05:00Z",
//         "template": "Test1",
//         "templateNumber": "Sample operator response"
//     }
// 