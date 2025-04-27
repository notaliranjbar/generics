public class NoteBook extends Product{
    private static int noteBookIds = 1;
    private int pagecount;
    private boolean isHardCover;
    // setters and getters
    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }
    public int getPagecount() {
        return pagecount;
    }
    public void setIsHardCover(boolean isHardCover) {
        this.isHardCover = isHardCover;
    }
    public boolean getIsHardCover() {
        return isHardCover;
    }
    //methods
    public String toString(){
        return ("title" + this.title +"price" + this.price +"pagecount : " + this.pagecount + ", isHardCover : " + this.isHardCover);
    }
    @Override
    protected String generateId(){
        int thisId = 2000 + noteBookIds;
        noteBookIds++;
        return Integer.toString(thisId);
    }
}
