[
 {
  "Name": "OpenRedirect", 
  "Active": false, 
  "Scanner": 1, 
  "Payloads": [
   "%2F%09%2Fevil.com", 
   "%2F%10%2Fevil.com", 
   "%2F%13%2Fevil.com", 
   "evil.com", 
   "/evil.com", 
   "//evil.com", 
   "///evil.com", 
   "////evil.com", 
   "/\\evil.com", 
   "%2fevil.com", 
   "%2f$2fevil.com", 
   "%2fevil.com%2f%2f", 
   "$2f%2fevil.com%2f%2f", 
   "%2fevil.com//", 
   "http://example.com%0a%23.evil.com"
  ], 
  "Encoder": [
   " "
  ], 
  "UrlEncode": false, 
  "CharsToUrlEncode": "", 
  "Grep": [
   "location.*evil.com"
  ], 
  "PayloadResponse": false, 
  "NotResponse": false, 
  "NotCookie": false, 
  "TimeOut": 0, 
  "isTime": false, 
  "CaseSensitive": false, 
  "isReplace": false, 
  "ExcludeHTTP": false, 
  "OnlyHTTP": false, 
  "IsContentType": false, 
  "ContentType": "", 
  "NegativeCT": false, 
  "IsResponseCode": true, 
  "ResponseCode": "300,  301,  302,  303,  304,  305,  306,  307,  308", 
  "NegativeRC": false, 
  "MatchType": 2, 
  "RedirType": 0, 
  "MaxRedir": 0, 
  "rCookies": false, 
  "spaceEncode": false, 
  "payloadPosition": 0, 
  "IssueName": "OpenRedirect", 
  "IssueSeverity": "High", 
  "IssueConfidence": "Certain", 
  "IssueDetail": "Open Redirect:\n\n<grep>", 
  "RemediationDetail": "", 
  "IssueBackground": "", 
  "RemediationBackground": ""
 }
]