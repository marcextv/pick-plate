package ec.com.mtv.pick.plate.data;

import ec.com.mtv.pick.plate.commons.PickPlateResources;
import lombok.Getter;

/**
 * Data repository for relation of time for Pick and Date rules.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
@Getter
public class PickTimeRelation {
	
	/**
	 * Instance of class.
	 */
	private static final PickTimeRelation INSTANCE = new PickTimeRelation();
	
	/**
	 * Initial value for morning rules.
	 */
	private String initMorningTime;
	
	/**
	 * End value for morning rules.
	 */
	private String endMorningTime;
	
	/**
	 * Initial value for afternoon rules.
	 */
	private String initAfterNoonTime;
	
	/**
	 * End value for afternoon/night rules.
	 */
	private String endNightTime;
	
	/**
	 * Private constructor. Set default values for pick time.
	 */
	private PickTimeRelation() {
		this.initMorningTime = PickPlateResources.DATA_MORNING_INITIAL;
		this.endMorningTime = PickPlateResources.DATA_MORNING_END;
		this.initAfterNoonTime = PickPlateResources.DATA_AFTERNOON_INITIAL;
		this.endNightTime = PickPlateResources.DATA_NIGHT_END;
	}
	
	/**
	 * @return the instance
	 */
	public static PickTimeRelation getInstance() {
		return INSTANCE;
	}

}
