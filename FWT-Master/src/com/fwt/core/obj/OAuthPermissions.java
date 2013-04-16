package com.fwt.core.obj;

import java.util.HashMap;
import java.util.Map;



public  class OAuthPermissions {

	public static Map<String,String> permissionsMap = new HashMap<String, String>();
	
	static{
	
		USER_PERMISSIONS [] permArrayUsers = OAuthPermissions.USER_PERMISSIONS.values();
		FRIENDS_PERMISSIONS [] permArrayFriends = OAuthPermissions.FRIENDS_PERMISSIONS.values();
		OTHER_PERMISSIONS [] permArrayOther = OAuthPermissions.OTHER_PERMISSIONS.values();
		
		for(int i=0;i<permArrayUsers.length;i++){
			OAuthPermissions.permissionsMap.put(permArrayUsers[i].toString(),permArrayUsers[i].toString());
		}
		for(int i=0;i<permArrayFriends.length;i++){
			OAuthPermissions.permissionsMap.put(permArrayFriends[i].toString(),permArrayFriends[i].toString());
		}
		for(int i=0;i<permArrayOther.length;i++){
			OAuthPermissions.permissionsMap.put(permArrayOther[i].toString(),permArrayOther[i].toString());
		}
		
		
	}
	
	public enum USER_PERMISSIONS{
		
		user_about_me,
		user_activities,
		user_birthday,
		user_checkins,
		user_education_history,
		user_events,
		user_groups,
		user_hometown,
		user_interests,
		user_likes,
		user_location,
		user_notes,
		user_photos,
		user_questions,
		user_relationships,
		user_relationship_details,
		user_religion_politics,
		user_status,
		user_subscriptions,
		user_videos,
		user_website,
		user_work_history,
		email
		
		
	}
	
	public enum FRIENDS_PERMISSIONS{
		friends_about_me,
		friends_activities,
		friends_birthday,
		friends_checkins,
		friends_education_history,
		friends_events,
		friends_groups,
		friends_hometown,
		friends_interests,
		friends_likes,
		friends_location,
		friends_notes,
		friends_photos,
		friends_questions,
		friends_relationships,
		friends_relationship_details,
		friends_religion_politics,
		friends_status,
		friends_subscriptions,
		friends_videos,
		friends_website,
		friends_work_history
		
		
	}
	
	public enum OTHER_PERMISSIONS{
		read_friendlists,
		read_insights,
		read_mailbox,
		read_requests,
		read_stream,
		xmpp_login,
		ads_management,
		create_event,
		manage_friendlists,
		manage_notifications,
		user_online_presence,
		friends_online_presence,
		publish_checkins,
		publish_stream,
		rsvp_event
		
	}
	
	
	
	
	
}
