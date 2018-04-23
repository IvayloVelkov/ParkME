package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _admin_devicefound(RemoteObject _name,RemoteObject _macaddress) throws Exception{
try {
		Debug.PushSubsStack("admin_DeviceFound (starter) ","starter",1,starter.processBA,starter.mostCurrent,25);
if (RapidSub.canDelegate("admin_devicefound")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","admin_devicefound", _name, _macaddress);
Debug.locals.put("Name", _name);
Debug.locals.put("MacAddress", _macaddress);
 BA.debugLineNum = 25;BA.debugLine="Private Sub admin_DeviceFound (Name As String, Mac";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Log($\"Device found: ${Name}\"$)";
Debug.ShouldStop(33554432);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Device found: "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 27;BA.debugLine="If Name = \"HC-06\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_name,BA.ObjectToString("HC-06"))) { 
 BA.debugLineNum = 28;BA.debugLine="Log(\"Trying to connect...\")";
Debug.ShouldStop(134217728);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Trying to connect...")));
 BA.debugLineNum = 29;BA.debugLine="admin.CancelDiscovery";
Debug.ShouldStop(268435456);
starter._admin.runVoidMethod ("CancelDiscovery");
 BA.debugLineNum = 30;BA.debugLine="serial.Connect(MacAddress)";
Debug.ShouldStop(536870912);
starter._serial.runVoidMethod ("Connect",starter.processBA,(Object)(_macaddress));
 };
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _admin_discoveryfinished() throws Exception{
try {
		Debug.PushSubsStack("admin_DiscoveryFinished (starter) ","starter",1,starter.processBA,starter.mostCurrent,34);
if (RapidSub.canDelegate("admin_discoveryfinished")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","admin_discoveryfinished");
 BA.debugLineNum = 34;BA.debugLine="Private Sub admin_DiscoveryFinished";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="connecting = False";
Debug.ShouldStop(4);
starter._connecting = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",1,starter.processBA,starter.mostCurrent,62);
if (RapidSub.canDelegate("application_error")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 62;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ast_newtext(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ast_NewText (starter) ","starter",1,starter.processBA,starter.mostCurrent,52);
if (RapidSub.canDelegate("ast_newtext")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","ast_newtext", _text);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 52;BA.debugLine="Private Sub ast_NewText (Text As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="CallSub2(Main, \"MessageFromDevice\", Text)";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(BA.ObjectToString("MessageFromDevice")),(Object)((_text)));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ast_terminated() throws Exception{
try {
		Debug.PushSubsStack("ast_Terminated (starter) ","starter",1,starter.processBA,starter.mostCurrent,56);
if (RapidSub.canDelegate("ast_terminated")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","ast_terminated");
 BA.debugLineNum = 56;BA.debugLine="Private Sub ast_Terminated";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="connected = False";
Debug.ShouldStop(16777216);
starter._connected = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 58;BA.debugLine="CallSub(Main, \"SetState\")";
Debug.ShouldStop(33554432);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("SetState")));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connect() throws Exception{
try {
		Debug.PushSubsStack("Connect (starter) ","starter",1,starter.processBA,starter.mostCurrent,19);
if (RapidSub.canDelegate("connect")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","connect");
 BA.debugLineNum = 19;BA.debugLine="Public Sub Connect";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="admin.StartDiscovery";
Debug.ShouldStop(524288);
starter._admin.runVoidMethod ("StartDiscovery");
 BA.debugLineNum = 21;BA.debugLine="connecting = True";
Debug.ShouldStop(1048576);
starter._connecting = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 22;BA.debugLine="CallSub(Main, \"SetState\")";
Debug.ShouldStop(2097152);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("SetState")));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private serial As Serial";
starter._serial = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial");
 //BA.debugLineNum = 8;BA.debugLine="Private admin As BluetoothAdmin";
starter._admin = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial.BluetoothAdmin");
 //BA.debugLineNum = 9;BA.debugLine="Private ast As AsyncStreamsText";
starter._ast = RemoteObject.createNew ("b4a.example.asyncstreamstext");
 //BA.debugLineNum = 10;BA.debugLine="Public connected As Boolean";
starter._connected = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 11;BA.debugLine="Public connecting As Boolean";
starter._connecting = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _serial_connected(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Serial_Connected (starter) ","starter",1,starter.processBA,starter.mostCurrent,38);
if (RapidSub.canDelegate("serial_connected")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","serial_connected", _success);
Debug.locals.put("Success", _success);
 BA.debugLineNum = 38;BA.debugLine="Private Sub Serial_Connected (Success As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="If Success Then";
Debug.ShouldStop(64);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 40;BA.debugLine="If ast.IsInitialized Then ast.Close";
Debug.ShouldStop(128);
if (starter._ast.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
starter._ast.runClassMethod (b4a.example.asyncstreamstext.class, "_close");};
 BA.debugLineNum = 41;BA.debugLine="ast.Initialize(Me, \"Ast\", serial.InputStream, se";
Debug.ShouldStop(256);
starter._ast.runClassMethod (b4a.example.asyncstreamstext.class, "_initialize",starter.processBA,(Object)(starter.getObject()),(Object)(BA.ObjectToString("Ast")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper"), starter._serial.runMethod(false,"getInputStream")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper"), starter._serial.runMethod(false,"getOutputStream")));
 BA.debugLineNum = 42;BA.debugLine="Log(\"Connected\")";
Debug.ShouldStop(512);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Connected")));
 BA.debugLineNum = 43;BA.debugLine="connected = True";
Debug.ShouldStop(1024);
starter._connected = starter.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 46;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA))));
 };
 BA.debugLineNum = 48;BA.debugLine="connecting = False";
Debug.ShouldStop(32768);
starter._connecting = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 49;BA.debugLine="CallSub(Main, \"SetState\")";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("SetState")));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",1,starter.processBA,starter.mostCurrent,14);
if (RapidSub.canDelegate("service_create")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_create");
 BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="serial.Initialize(\"serial\")";
Debug.ShouldStop(16384);
starter._serial.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("serial")));
 BA.debugLineNum = 16;BA.debugLine="admin.Initialize(\"admin\")";
Debug.ShouldStop(32768);
starter._admin.runVoidMethod ("Initialize",starter.processBA,(Object)(RemoteObject.createImmutable("admin")));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}