package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends  android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        BA.LogInfo("** Service (starter) Destroy **");
		processBA.raiseEvent(null, "service_destroy");
        processBA.service = null;
		mostCurrent = null;
		processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Serial _serial = null;
public static anywheresoftware.b4a.objects.Serial.BluetoothAdmin _admin = null;
public static b4a.example.asyncstreamstext _ast = null;
public static boolean _connected = false;
public static boolean _connecting = false;
public b4a.example.main _main = null;
public static String  _connect() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "connect"))
	return (String) Debug.delegate(processBA, "connect", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Connect";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="admin.StartDiscovery";
_admin.StartDiscovery();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="connecting = True";
_connecting = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="CallSub(Main, \"SetState\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._main.getObject()),"SetState");
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="End Sub";
return "";
}
public static String  _admin_devicefound(String _name,String _macaddress) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "admin_devicefound"))
	return (String) Debug.delegate(processBA, "admin_devicefound", new Object[] {_name,_macaddress});
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub admin_DeviceFound (Name As String, Mac";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Log($\"Device found: ${Name}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Device found: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_name))+""));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If Name = \"HC-06\" Then";
if ((_name).equals("HC-06")) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Log(\"Trying to connect...\")";
anywheresoftware.b4a.keywords.Common.Log("Trying to connect...");
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="admin.CancelDiscovery";
_admin.CancelDiscovery();
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="serial.Connect(MacAddress)";
_serial.Connect(processBA,_macaddress);
 };
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="End Sub";
return "";
}
public static String  _admin_discoveryfinished() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "admin_discoveryfinished"))
	return (String) Debug.delegate(processBA, "admin_discoveryfinished", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub admin_DiscoveryFinished";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="connecting = False";
_connecting = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error"))
	return (Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace});
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return false;
}
public static String  _ast_newtext(String _text) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ast_newtext"))
	return (String) Debug.delegate(processBA, "ast_newtext", new Object[] {_text});
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub ast_NewText (Text As String)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="CallSub2(Main, \"MessageFromDevice\", Text)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(processBA,(Object)(mostCurrent._main.getObject()),"MessageFromDevice",(Object)(_text));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public static String  _ast_terminated() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "ast_terminated"))
	return (String) Debug.delegate(processBA, "ast_terminated", null);
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub ast_Terminated";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="connected = False";
_connected = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="CallSub(Main, \"SetState\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._main.getObject()),"SetState");
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="End Sub";
return "";
}
public static String  _serial_connected(boolean _success) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "serial_connected"))
	return (String) Debug.delegate(processBA, "serial_connected", new Object[] {_success});
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub Serial_Connected (Success As Boolean)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If ast.IsInitialized Then ast.Close";
if (_ast.IsInitialized()) { 
_ast._close(null);};
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="ast.Initialize(Me, \"Ast\", serial.InputStream, se";
_ast._initialize(null,processBA,starter.getObject(),"Ast",(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(_serial.getInputStream())),(anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper(), (java.io.OutputStream)(_serial.getOutputStream())));
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Log(\"Connected\")";
anywheresoftware.b4a.keywords.Common.Log("Connected");
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="connected = True";
_connected = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
 };
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="connecting = False";
_connecting = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="CallSub(Main, \"SetState\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._main.getObject()),"SetState");
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create"))
	return (String) Debug.delegate(processBA, "service_create", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="serial.Initialize(\"serial\")";
_serial.Initialize("serial");
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="admin.Initialize(\"admin\")";
_admin.Initialize(processBA,"admin");
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="End Sub";
return "";
}
}