package music.api.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class MusicDO {
	
	private long id;
	private String title;
	private String description;
	private String image;
	private String background_image;
	private boolean isVideo;
	private String path;
	private String duration;
	private int likeCount;
	private int disLikeCount;
	private double rating;
	private String video_path;
	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	public MusicDO(long id, String title, String description, String image, String background_image, boolean isVideo,
			String path, String duration, int likeCount, int disLikeCount, double rating, String video_path,
			String field1, String field2, String field3, String field4, String field5) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.image = image;
		this.background_image = background_image;
		this.isVideo = isVideo;
		this.path = path;
		this.duration = duration;
		this.likeCount = likeCount;
		this.disLikeCount = disLikeCount;
		this.rating = rating;
		this.video_path = video_path;
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
	}
	
	
	
	
	

}
