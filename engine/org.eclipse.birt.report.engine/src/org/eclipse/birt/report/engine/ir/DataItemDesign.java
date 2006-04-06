/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.ir;

/**
 * DataItem.
 * 
 * reference to report design schema.
 * 
 * @version $Revision: 1.9 $ $Date: 2006/02/27 07:35:59 $
 */
public class DataItemDesign extends ReportItemDesign
{

	/**
	 * Data expression
	 */
	protected String value;

	/**
	 * help text
	 */
	protected String helpText;
	/**
	 * help text resource key
	 */
	protected String helpTextKey;
	
	protected boolean suppressDuplicate = false; 
	/**
	 * default constructor. create an empty expression.
	 */
	public DataItemDesign( )
	{
	}

	/**
	 * get the value expression
	 * 
	 * @return value expression
	 */
	public String getValue( )
	{
		return this.value;
	}

	/**
	 * set the value expression
	 * 
	 * @param value
	 *            value expression
	 */
	public void setValue( String value )
	{
		this.value = value;
	}

	public Object accept( IReportItemVisitor visitor, Object value )
	{
		return visitor.visitDataItem( this , value);
	}

	/**
	 * set the help info.
	 * 
	 * @param key
	 *            resource key
	 * @param text
	 *            text content
	 */
	public void setHelpText( String key, String text )
	{
		this.helpTextKey = key;
		this.helpText = text;
	}

	/**
	 * get the help text property.
	 * 
	 * @return help text
	 */
	public String getHelpText( )
	{
		return this.helpText;
	}

	/**
	 * get the help text resource key property.
	 * 
	 * @return resource key of the help text
	 */
	public String getHelpTextKey( )
	{
		return this.helpTextKey;
	}
	
	public void setSuppressDuplicate(boolean suppress)
	{
		suppressDuplicate = suppress;
	}
	
	public boolean getSuppressDuplicate()
	{
		return suppressDuplicate;
	}
}
