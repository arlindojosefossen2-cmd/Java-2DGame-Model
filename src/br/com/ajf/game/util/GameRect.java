package br.com.ajf.game.util;

/**
 *  Author A.J.F
 * The Class GameRect.
 * @version 1.0
 * 23 June 2025
 */
public final class GameRect
{
	
	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	
	/** The width. */
	private int width;
	
	/** The height. */
	private int height;
		
	/**
	 * Instantiates a new game rect.
	 */
	public GameRect()
	{
	
	}	

	/**
	 * Instantiates a new game rect.
	 *
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param height the height
	 */
	public GameRect(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 * Contains.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if successful
	 */
	public boolean contains(double x, double y) 
	{
        double x0 = getX();
        double y0 = getY();
        
        return (x >= x0 &&
                y >= y0 &&
                x < x0 + getWidth() &&
                y < y0 + getHeight());
    }


    /**
     * Intersects.
     *
     * @param x the x
     * @param y the y
     * @param w the w
     * @param h the h
     * @return true, if successful
     */
    public boolean intersects(double x, double y, double w, double h) 
    {
        if (w <= 0 || h <= 0) 
        {
            return false;
        }
        double x0 = getX();
        double y0 = getY();
        
        return (x + w > x0 &&
                y + h > y0 &&
                x < x0 + getWidth() &&
                y < y0 + getHeight());
    }


	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX()
	{
		return x;
	}


	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x)
	{
		this.x = x;
	}


	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY()
	{
		return y;
	}


	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y)
	{
		this.y = y;
	}


	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth()
	{
		return width;
	}


	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}


	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight()
	{
		return height;
	}


	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}

	/**
	 * Intersects.
	 *
	 * @param solidArea the solid area
	 * @return true, if successful
	 */
	public boolean intersects(GameRect solidArea)
	{
		return intersects(solidArea.getX(), solidArea.getY(), solidArea.getWidth(), solidArea.getHeight());
	}
}