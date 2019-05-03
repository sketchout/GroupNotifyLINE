# GroupNotifyLINE
Send Notify Message to LINE Group(GroupChat)

# Usage in Java
~~~
GroupNotifyLINE ln = new GroupNotifyLINE();
ln.postNotify(_MY_TOKEN, strMessage);
~~~

## postNotify()
~~~
HttpURLConnection connection = getConnection(token, new URL(_NOTIFY_API));
String parameterString = new String("message=" + message);

connection.getOutputStream().write(parameterString.getBytes("UTF-8"));
connection.getInputStream();
int statusCode = connection.getResponseCode();
~~~

# Get Your Token
1.Build the GroupChat at the Line(Messenger)
2.Invite the "LineNotify" to the Group
3.Get the Token for the GroupChat at https://notify-bot.line.me
