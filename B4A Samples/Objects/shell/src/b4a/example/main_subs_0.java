package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="lblStatus.Initialize(\"\")";
Debug.ShouldStop(268435456);
main.mostCurrent._lblstatus.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 30;BA.debugLine="btnConnect.Initialize(\"btnConnect\")";
Debug.ShouldStop(536870912);
main.mostCurrent._btnconnect.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnConnect")));
 BA.debugLineNum = 31;BA.debugLine="lblMessage.Initialize(\"\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._lblmessage.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="lblMessage2.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._lblmessage2.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 34;BA.debugLine="Activity.AddView(lblStatus, 5%x, 5%y, 90%x, 20%y)";
Debug.ShouldStop(2);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._lblstatus.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 35;BA.debugLine="Activity.AddView(btnConnect, 5%x, 30%y, 20%x, 10%";
Debug.ShouldStop(4);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._btnconnect.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 36;BA.debugLine="Activity.AddView(lblMessage, 5%x, 55%y, 30%x, 30%";
Debug.ShouldStop(8);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._lblmessage.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 55)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 37;BA.debugLine="Activity.AddView(lblMessage2, 40%x, 55%y, 30%x, 3";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._lblmessage2.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 55)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 39;BA.debugLine="btnConnect.Color = Colors.Blue";
Debug.ShouldStop(64);
main.mostCurrent._btnconnect.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 40;BA.debugLine="lblMessage.Color = Colors.Green";
Debug.ShouldStop(128);
main.mostCurrent._lblmessage.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 41;BA.debugLine="lblMessage2.Color = Colors.Green";
Debug.ShouldStop(256);
main.mostCurrent._lblmessage2.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,71);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="SetState";
Debug.ShouldStop(8192);
_setstate();
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconnect_click() throws Exception{
try {
		Debug.PushSubsStack("btnConnect_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,75);
if (RapidSub.canDelegate("btnconnect_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","btnconnect_click");
 BA.debugLineNum = 75;BA.debugLine="Sub btnConnect_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="CallSub(Starter, \"Connect\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",main.processBA,(Object)((main.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("Connect")));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private lblStatus As Label";
main.mostCurrent._lblstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private btnConnect As Button";
main.mostCurrent._btnconnect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblMessage As Label";
main.mostCurrent._lblmessage = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblMessage2 As Label";
main.mostCurrent._lblmessage2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _messagefromdevice(RemoteObject _msg,RemoteObject _sens) throws Exception{
try {
		Debug.PushSubsStack("MessageFromDevice (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,62);
if (RapidSub.canDelegate("messagefromdevice")) return b4a.example.main.remoteMe.runUserSub(false, "main","messagefromdevice", _msg, _sens);
Debug.locals.put("msg", _msg);
Debug.locals.put("sens", _sens);
 BA.debugLineNum = 62;BA.debugLine="Public Sub MessageFromDevice(msg As Int, sens As I";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Select sens";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_sens,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 64;BA.debugLine="Case 1: If msg <= 20 Then lblMessage.Color = Col";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("k",_msg,BA.numberCast(double.class, 20))) { 
main.mostCurrent._lblmessage.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));};
 break; }
case 1: {
 BA.debugLineNum = 65;BA.debugLine="Case 2: If msg <= 20 Then lblMessage2.Color = Co";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("k",_msg,BA.numberCast(double.class, 20))) { 
main.mostCurrent._lblmessage2.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));};
 break; }
}
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
asyncstreamstext.myClass = BA.getDeviceClass ("b4a.example.asyncstreamstext");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setstate() throws Exception{
try {
		Debug.PushSubsStack("SetState (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("setstate")) return b4a.example.main.remoteMe.runUserSub(false, "main","setstate");
RemoteObject _status = RemoteObject.createImmutable("");
 BA.debugLineNum = 49;BA.debugLine="Public Sub SetState";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="btnConnect.Enabled = Not(Starter.connected)";
Debug.ShouldStop(131072);
main.mostCurrent._btnconnect.runMethod(true,"setEnabled",main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._starter._connected)));
 BA.debugLineNum = 51;BA.debugLine="Dim status As String";
Debug.ShouldStop(262144);
_status = RemoteObject.createImmutable("");Debug.locals.put("status", _status);
 BA.debugLineNum = 52;BA.debugLine="If Starter.connected Then";
Debug.ShouldStop(524288);
if (main.mostCurrent._starter._connected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 53;BA.debugLine="status = \"connected\"";
Debug.ShouldStop(1048576);
_status = BA.ObjectToString("connected");Debug.locals.put("status", _status);
 }else 
{ BA.debugLineNum = 54;BA.debugLine="else if Starter.connecting Then";
Debug.ShouldStop(2097152);
if (main.mostCurrent._starter._connecting.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 55;BA.debugLine="status = \"trying to connect...\"";
Debug.ShouldStop(4194304);
_status = BA.ObjectToString("trying to connect...");Debug.locals.put("status", _status);
 }else {
 BA.debugLineNum = 57;BA.debugLine="status = \"disconnected\"";
Debug.ShouldStop(16777216);
_status = BA.ObjectToString("disconnected");Debug.locals.put("status", _status);
 }}
;
 BA.debugLineNum = 59;BA.debugLine="lblStatus.Text = $\"Status: ${status}\"$";
Debug.ShouldStop(67108864);
main.mostCurrent._lblstatus.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Status: "),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}