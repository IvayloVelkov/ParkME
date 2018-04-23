package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asyncstreamstext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.asyncstreamstext");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.asyncstreamstext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public Object _mtarget = null;
public String _meventname = "";
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public String _charset = "";
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _close(b4a.example.asyncstreamstext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asyncstreamstext";
if (Debug.shouldDelegate(ba, "close"))
	return (String) Debug.delegate(ba, "close", null);
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="astreams.Close";
__ref._astreams.Close();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.asyncstreamstext __ref,anywheresoftware.b4a.BA _ba,Object _targetmodule,String _eventname,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asyncstreamstext";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_targetmodule,_eventname,_in,_out});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize (TargetModule As Object, Eve";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="mTarget = TargetModule";
__ref._mtarget = _targetmodule;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="astreams.Initialize(In, out, \"astreams\")";
__ref._astreams.Initialize(ba,(java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()),"astreams");
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="sb.Initialize";
__ref._sb.Initialize();
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="End Sub";
return "";
}
public String  _astreams_error(b4a.example.asyncstreamstext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asyncstreamstext";
if (Debug.shouldDelegate(ba, "astreams_error"))
	return (String) Debug.delegate(ba, "astreams_error", null);
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub astreams_Error";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Log(\"error: \" & LastException)";
__c.Log("error: "+BA.ObjectToString(__c.LastException(getActivityBA())));
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="astreams.Close";
__ref._astreams.Close();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="CallSubDelayed(mTarget, mEventName & \"_Terminated";
__c.CallSubDelayed(ba,__ref._mtarget,__ref._meventname+"_Terminated");
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
public String  _astreams_newdata(b4a.example.asyncstreamstext __ref,byte[] _buffer) throws Exception{
__ref = this;
RDebugUtils.currentModule="asyncstreamstext";
if (Debug.shouldDelegate(ba, "astreams_newdata"))
	return (String) Debug.delegate(ba, "astreams_newdata", new Object[] {_buffer});
int _newdatastart = 0;
String _s = "";
int _start = 0;
int _i = 0;
char _c = '\0';
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub astreams_NewData (Buffer() As Byte)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim newDataStart As Int = sb.Length";
_newdatastart = __ref._sb.getLength();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="sb.Append(BytesToString(Buffer, 0, Buffer.Length,";
__ref._sb.Append(__c.BytesToString(_buffer,(int) (0),_buffer.length,__ref._charset));
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim s As String = sb.ToString";
_s = __ref._sb.ToString();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Dim start As Int = 0";
_start = (int) (0);
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="For i = newDataStart To s.Length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_s.length()-1);
_i = _newdatastart ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Dim c As Char = s.CharAt(i)";
_c = _s.charAt(_i);
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="If i = 0 And c = Chr(10) Then '\\n...";
if (_i==0 && _c==__c.Chr((int) (10))) { 
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="start = 1 'might be a broken end of line charac";
_start = (int) (1);
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="If c = Chr(10) Then '\\n";
if (_c==__c.Chr((int) (10))) { 
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="CallSubDelayed2(mTarget, mEventName & \"_NewText";
__c.CallSubDelayed2(ba,__ref._mtarget,__ref._meventname+"_NewText",(Object)(_s.substring(_start,_i)));
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="start = i + 1";
_start = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="Else If c = Chr(13) Then '\\r";
if (_c==__c.Chr((int) (13))) { 
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="CallSubDelayed2(mTarget, mEventName & \"_NewText";
__c.CallSubDelayed2(ba,__ref._mtarget,__ref._meventname+"_NewText",(Object)(_s.substring(_start,_i)));
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="If i < s.Length - 1 And s.CharAt(i + 1) = Chr(1";
if (_i<_s.length()-1 && _s.charAt((int) (_i+1))==__c.Chr((int) (10))) { 
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 };
RDebugUtils.currentLine=1703955;
 //BA.debugLineNum = 1703955;BA.debugLine="start = i + 1";
_start = (int) (_i+1);
 }}
;
 }
};
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="If start > 0 Then sb.Remove(0, start)";
if (_start>0) { 
__ref._sb.Remove((int) (0),_start);};
RDebugUtils.currentLine=1703959;
 //BA.debugLineNum = 1703959;BA.debugLine="End Sub";
return "";
}
public String  _astreams_terminated(b4a.example.asyncstreamstext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asyncstreamstext";
if (Debug.shouldDelegate(ba, "astreams_terminated"))
	return (String) Debug.delegate(ba, "astreams_terminated", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub astreams_Terminated";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="CallSubDelayed(mTarget, mEventName & \"_Terminated";
__c.CallSubDelayed(ba,__ref._mtarget,__ref._meventname+"_Terminated");
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.asyncstreamstext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asyncstreamstext";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Private mTarget As Object";
_mtarget = new Object();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Public astreams As AsyncStreams";
_astreams = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Public charset As String = \"UTF8\"";
_charset = "UTF8";
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Private sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return "";
}
public String  _write(b4a.example.asyncstreamstext __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="asyncstreamstext";
if (Debug.shouldDelegate(ba, "write"))
	return (String) Debug.delegate(ba, "write", new Object[] {_text});
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub Write(Text As String)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="astreams.Write(Text.GetBytes(charset))";
__ref._astreams.Write(_text.getBytes(__ref._charset));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
}