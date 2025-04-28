import React from "react";
import Slider from "../pages/home/Slider";
import Request from "../pages/home/Request";
import Services from "../pages/home/Services";
import Region from "../pages/home/Region";
import Subscribe from "../pages/home/Subscribe";
import Section1 from "../pages/home/Section1";

function Home() {
    return (
        <div className="container">
            <Slider/>
            <Section1 categoryId={1} categoryName="Iphone"/>
            <Section1 categoryId={2} categoryName="Samsung"/>
            <Request/>
            <Services/>
            <Region/>
            <Subscribe/>
        </div>
    );
}

export default Home;