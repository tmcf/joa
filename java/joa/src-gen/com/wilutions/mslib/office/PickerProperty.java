/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * PickerProperty.
 * 
 */
@CoInterface(guid="{000C03E2-0000-0000-C000-000000000046}")
public interface PickerProperty extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public String getId() throws ComException;
  @DeclDISPID(2)  public Object getValue() throws ComException;
  @DeclDISPID(3)  public MsoPickerField getType() throws ComException;
}
