/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E48-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoLeaderLinesImpl extends Dispatch implements com.wilutions.mslib.office.IMsoLeaderLines {
  @DeclDISPID(235)  public void Select() throws ComException {
    this._dispatchCall(235,"Select", DISPATCH_METHOD,null);
  }
  @DeclDISPID(128)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(128,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoBorderImpl.class);
  }
  @DeclDISPID(117)  public void Delete() throws ComException {
    this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IMsoChartFormatImpl.class);
  }
  @DeclDISPID(148)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(150)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public IMsoLeaderLinesImpl(String progId) throws ComException {
    super(progId, "{000C1723-0000-0000-C000-000000000046}");
  }
  protected IMsoLeaderLinesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoLeaderLinesImpl" + super.toString() + "]";
  }
}
