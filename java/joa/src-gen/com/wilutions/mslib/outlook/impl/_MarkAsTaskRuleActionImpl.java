/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9BD-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _MarkAsTaskRuleActionImpl extends Dispatch implements com.wilutions.mslib.outlook._MarkAsTaskRuleAction {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64271)  public com.wilutions.mslib.outlook.OlRuleActionType getActionType() throws ComException {
    final Object obj = this._dispatchCall(64271,"ActionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRuleActionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64292)  public String getFlagTo() throws ComException {
    final Object obj = this._dispatchCall(64292,"FlagTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64292)  public void setFlagTo(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64292,"FlagTo", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64293)  public com.wilutions.mslib.outlook.OlMarkInterval getMarkInterval() throws ComException {
    final Object obj = this._dispatchCall(64293,"MarkInterval", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlMarkInterval.valueOf((Integer)obj);
  }
  @DeclDISPID(64293)  public void setMarkInterval(com.wilutions.mslib.outlook.OlMarkInterval value) throws ComException {
    assert(value != null);
    this._dispatchCall(64293,"MarkInterval", DISPATCH_PROPERTYPUT,value.value);
  }
  public _MarkAsTaskRuleActionImpl(String progId) throws ComException {
    super(progId, "{000630D6-0000-0000-C000-000000000046}");
  }
  protected _MarkAsTaskRuleActionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_MarkAsTaskRuleActionImpl" + super.toString() + "]";
  }
}
