// ==UserScript==
// @name         spotifyAds
// @namespace    http://tampermonkey.net/
// @version      0.3
// @description  Y
// @author       Jose Torres
// @license      Unlicense
// @match        https://open.spotify.com/*
// @icon         https://www.google.com/s2/favicons?sz=64&domain=youtube.com
// @run-at       document-start
// @grant        none
// ==/UserScript==

(() => {

const observer = new MutationObserver(mutations => {
const observer = new MutationObserver(mutations => {
    let PLAYING = "Playing : ";
    let PROCESSING = false;

    let playButtonTop = document.querySelector("[data-testid='play-button']");
    let playButtonBottom = document.querySelector("[data-test-id='play-pause-button']");
    let floatingPlayer = document.querySelectorAll("[data-testid='floating-now-playing-bar'] span");
    let ad = document.querySelector("[data-testid='npv-header-title']");

    let closeBtn = document.querySelector("button[aria-label='Close']");
    let nvmPlayerButton = document.querySelector("[data-testid='npv-play-button']");

    if (localStorage.getItem("reload") === "true" && PROCESSING === false) {
        setTimeout(function () {
            if (!!nvmPlayerButton) {
                PROCESSING = true;
                nvmPlayerButton.click();
                localStorage.removeItem("reload");
                if (!!closeBtn) {
                    closeBtn.click();
                }
                PROCESSING = false;
                console.log(PLAYING + "AD SKIPPED - click NVP");

            } else {
                if (!!playButtonTop && !playButtonBottom) {
                    PROCESSING = true;
                    playButtonTop.click();
                    localStorage.removeItem("reload");
                    PROCESSING = false;
                    console.log(PLAYING + "AD SKIPPED - click TOP ");
                } else if (!!playButtonBottom) {
                    PROCESSING = true;
                    playButtonBottom.click();
                    localStorage.removeItem("reload");
                    PROCESSING = false;
                    console.log(PLAYING + "AD SKIPPED - click BOTTOM");
                }
            }

        }, 3600);


    } else {
        if (!!ad && 'Advertisement' === ad.textContent) {
            localStorage.setItem("reload", "true");
            window.location.reload(true);
        }
        if (!!floatingPlayer && floatingPlayer.length === 2) {
            console.log(PLAYING + floatingPlayer[1].innerText + " - " + floatingPlayer[0].innerText);
        } else {
            let tunePlayer = document.querySelectorAll("[data-testid='npv-metadata-container'] a");
            if (!!tunePlayer && tunePlayer.length === 2) {
                console.log(PLAYING + tunePlayer[1].innerText + " - " + tunePlayer[0].innerText);
            }
        }
    }

});
observer.observe(document, {subtree: true, childList: true});

})()
