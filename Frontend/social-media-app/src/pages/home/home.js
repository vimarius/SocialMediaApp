import Topbar from "../../components/topbar/topbar.js";
import Sidebar from "../../components/sidebar/sidebar.js";
import Feed from "../../components/feed/feed.js";
import Rightbar from "../../components/rightbar/rightbar.js";
import "./home.css"

export default function Home() {
  return (
    <>
      <Topbar />
      <div className="homeContainer">
        <Sidebar />
        <Feed/>
        <Rightbar/>
      </div>
    </>
  );
}