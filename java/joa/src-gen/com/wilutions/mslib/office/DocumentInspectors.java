/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * DocumentInspectors.
 * 
 */
@CoInterface(guid="{000C0392-0000-0000-C000-000000000046}")
public interface DocumentInspectors extends IDispatch {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(0)  public DocumentInspector getItem(Integer Index) throws ComException;
  @DeclDISPID(1)  public Integer getCount() throws ComException;
  @DeclDISPID(2)  public Dispatch getParent() throws ComException;
}
