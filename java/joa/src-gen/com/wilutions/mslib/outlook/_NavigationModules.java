/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _NavigationModules.
 * 
 */
@CoInterface(guid="{000630E7-0000-0000-C000-000000000046}")
public interface _NavigationModules extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(80)  public Integer getCount() throws ComException;
  @DeclDISPID(81)  public _NavigationModule Item(final Object Index) throws ComException;
  @DeclDISPID(64440)  public NavigationModule GetNavigationModule(final OlNavigationModuleType ModuleType) throws ComException;
}
