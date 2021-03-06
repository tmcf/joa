/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9ABF-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IConverterPreferencesImpl extends Dispatch implements com.wilutions.mslib.office.IConverterPreferences {
  @DeclDISPID(1)  public void HrGetMacroEnabled(final ByRef<Integer> pfMacroEnabled) throws ComException {
    assert(pfMacroEnabled != null);
    this._dispatchCall(1,"HrGetMacroEnabled", DISPATCH_METHOD,null,pfMacroEnabled);
  }
  @DeclDISPID(2)  public void HrCheckFormat(final ByRef<Integer> pFormat) throws ComException {
    assert(pFormat != null);
    this._dispatchCall(2,"HrCheckFormat", DISPATCH_METHOD,null,pFormat);
  }
  @DeclDISPID(3)  public void HrGetLossySave(final ByRef<Integer> pfLossySave) throws ComException {
    assert(pfLossySave != null);
    this._dispatchCall(3,"HrGetLossySave", DISPATCH_METHOD,null,pfLossySave);
  }
  public IConverterPreferencesImpl(String progId) throws ComException {
    super(progId, "{000C03D4-0000-0000-C000-000000000046}");
  }
  protected IConverterPreferencesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConverterPreferencesImpl" + super.toString() + "]";
  }
}
