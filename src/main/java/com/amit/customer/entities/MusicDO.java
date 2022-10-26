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

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBackground_image() {
		return background_image;
	}
	public void setBackground_image(String background_image) {
		this.background_image = background_image;
	}
	public boolean isVideo() {
		return isVideo;
	}
	public void setVideo(boolean isVideo) {
		this.isVideo = isVideo;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public int getDisLikeCount() {
		return disLikeCount;
	}
	public void setDisLikeCount(int disLikeCount) {
		this.disLikeCount = disLikeCount;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getVideo_path() {
		return video_path;
	}
	public void setVideo_path(String video_path) {
		this.video_path = video_path;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getField3() {
		return field3;
	}
	public void setField3(String field3) {
		this.field3 = field3;
	}
	public String getField4() {
		return field4;
	}
	public void setField4(String field4) {
		this.field4 = field4;
	}
	public String getField5() {
		return field5;
	}
	public void setField5(String field5) {
		this.field5 = field5;
	}
	
	
	
	
	

}
