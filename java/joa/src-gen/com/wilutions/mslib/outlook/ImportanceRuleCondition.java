/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ImportanceRuleCondition.
 * 
 */
@CoClass(guid="{000610DA-0000-0000-C000-000000000046}")
public class ImportanceRuleCondition extends Dispatch implements _ImportanceRuleCondition {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
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
  @DeclDISPID(64298)  public OlRuleConditionType getConditionType() throws ComException {
    final Object obj = this._dispatchCall(64298,"ConditionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRuleConditionType.valueOf((Integer)obj);
  }
  @DeclDISPID(64299)  public OlImportance getImportance() throws ComException {
    final Object obj = this._dispatchCall(64299,"Importance", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlImportance.valueOf((Integer)obj);
  }
  @DeclDISPID(64299)  public void setImportance(OlImportance value) throws ComException {
    assert(value != null);
    this._dispatchCall(64299,"Importance", DISPATCH_PROPERTYPUT,value.value);
  }
  public ImportanceRuleCondition() throws ComException {
    super("{000610DA-0000-0000-C000-000000000046}");
  }
  protected ImportanceRuleCondition(long ndisp) {
    super(ndisp);
  }
  public ImportanceRuleCondition(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ImportanceRuleCondition" + super.toString() + "]";
  }
}
