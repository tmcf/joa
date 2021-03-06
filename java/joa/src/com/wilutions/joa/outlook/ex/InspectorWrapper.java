/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.outlook.ex;

import java.util.HashMap;
import java.util.Map;

import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.IDispatch;
import com.wilutions.joa.ribbon.RibbonControls;
import com.wilutions.mslib.office.IRibbonControl;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorEvents_10;

public class InspectorWrapper extends DispatchImpl implements InspectorEvents_10, Wrapper {

	protected Inspector inspector;
	protected IDispatch currentItem;
	protected Map<String, IRibbonControl> ribbonControlsDispatchReferences = new HashMap<String, IRibbonControl>();

	/**
	 * Ribbon control map.
	 * This map contains objects from package com.wilutions.joa.ribbon.
	 * It does not contain COM objects.
	 */
	protected RibbonControls ribbonControls = new RibbonControls();

	/**
	 * Constructor. Initializes a new object. Attaches the inspector events to
	 * this.
	 * 
	 * @param inspector
	 *            Inspector object.
	 * @param currentItem
	 *            The inspector's current item. Sometimes the getCurrentItem
	 *            Method does not return the item after the inspector has been
	 *            opened. For this reason, it is passed explicitly here.
	 * @throws ComException Thrown, if a COM related error occurs.
	 */
	public InspectorWrapper(Inspector inspector, IDispatch currentItem) throws ComException {
		this.inspector = inspector;
		this.currentItem = currentItem;
		Dispatch.withEvents(inspector, this);
	}

	public Inspector getInspector() {
		return inspector;
	}
	
	@Override
	public IDispatch getWrappedObject() {
		return getInspector();
	}
	
	public <T> T getCurrentItemAs(Class<T> clazz) {
		return currentItem.as(clazz);
	}

	@Override
	public void onActivate() throws ComException {
	}

	@Override
	public void onDeactivate() throws ComException {
	}

	@Override
	public void onClose() throws ComException {
		ribbonControlsDispatchReferences.clear();
		if (inspector != null) {
			inspector.releaseEvents(this);
			inspector.releaseComObject();
			InspectorWrappers.remove(this);
		}
		inspector = null;
		currentItem = null;
		System.gc();
	}

	@Override
	public void onBeforeMaximize(ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onBeforeMinimize(ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onBeforeMove(ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onBeforeSize(ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onPageChange(String ActivePageName) throws ComException {
	}

	@Override
	public void onAttachmentSelectionChange() throws ComException {
	}

	@Override
	public void addRibbonControlDispatchReference(IRibbonControl control) {
		ribbonControlsDispatchReferences.put(control.getId(), control);
	}

	@Override
	public RibbonControls getRibbonControls() {
		return ribbonControls;
	}
}